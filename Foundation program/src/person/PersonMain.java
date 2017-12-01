package com.person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PersonMain {
	public static void main(String a[]) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		int i = 0;
		while (i < 2) {
			session.beginTransaction();
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name : ");
			String name = bf.readLine();
			System.out.println("Enter address : ");
			String address = bf.readLine();
			System.out.println("Enter department");
			String dept = bf.readLine();
			System.out.println("Press 1.Teacher details \n      2.Students details ");
			int choice = Integer.parseInt(bf.readLine());
			switch (choice) {
			case 1:
				System.out.println("Enter Basic Pay : ");
				double basicPay = Double.parseDouble(bf.readLine());
				System.out.println("Enter Travel Allowance : ");
				double travelAllowance = Double.parseDouble(bf.readLine());
				System.out.println("Enter Dearnesss Allowance : ");
				double dearnessAllowance = Double.parseDouble(bf.readLine());
				System.out.println("Enter house Rent Allowance : ");
				double houseRentAllowance = Double.parseDouble(bf.readLine());
				System.out.println("Enter Provident Fund  : ");
				double providentFund = Double.parseDouble(bf.readLine());
				Teacher teacher = new Teacher(name, address, dept, basicPay, houseRentAllowance, dearnessAllowance,
						providentFund, travelAllowance);
				System.out.println("id: " + teacher.getId());
				System.out.println("name: " + teacher.getName());
				System.out.println("dept: " + teacher.getDept());
				System.out.println("Address: " + teacher.getAddress());
				System.out.println("Basic Pay" + teacher.getBasicPay());
				System.out.println("ta: " + teacher.getTravelAllowance());
				System.out.println("da: " + teacher.getDearnessAllowance());
				System.out.println("hra: " + teacher.getHouseRentAllowance());
				System.out.println("netsalary: " + teacher.getNetSalary());
				session.save(teacher);
				break;
			case 2:
				System.out.println("Enter credit points: ");
				int creditsEarned = Integer.parseInt(bf.readLine());
				System.out.println("Enter grade: ");
				char totalGrade = (char) bf.read();
				Student student = new Student(name, address, dept, creditsEarned, totalGrade);
				System.out.println("id: " + student.getId());
				System.out.println("name: " + student.getName());
				System.out.println("dept: " + student.getDept());
				System.out.println("Address: " + student.getAddress());
				System.out.println("Credits Earned: " + student.getCreditsEarned());
				System.out.println("Total grade: " + student.getTotalGrade());
				session.save(student);
				break;
			}
			session.getTransaction().commit();
			i++;
		}
		session.close();
	}
}
