package org.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		int i = 0;

		while (i < 3) {
			session.beginTransaction();
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Book_id : ");
			int bookId = Integer.valueOf(bf.readLine());
			System.out.print("Enter Title: ");
			String title = bf.readLine();
			System.out.print("Enter Author : ");
			String author = bf.readLine();
			System.out.print("Enter Price : ");
			int price = Integer.valueOf(bf.readLine());
			System.out.println("Enter Available or not : ");
			boolean available = Boolean.valueOf(bf.readLine());
			Book book = new Book(bookId, title, author, price, available);
			session.save(book);
			session.getTransaction().commit();
			i++;
		}
		// sf.close();
		session.close();

	}

}
