package com.bank;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BankMain {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BankAccount ba = new BankAccount();
		/*ba.setAccountHolder(bf.readLine());
		ba.setAccountNumber(Long.valueOf(bf.readLine()));
		ba.setAddress(bf.readLine());
		ba.setBalance(Double.valueOf(bf.readLine()));
		ba.setEmail(bf.readLine());
		ba.setPhoneNo(Long.valueOf(bf.readLine()));*/
		ba.setAccountHolder("Janu");
		ba.setAccountNumber(1234567890);
		ba.setAddress("Coimbatore");
		ba.setBalance(100);
		ba.setEmail("a@gmail.com");
		ba.setPhoneNo(987654321);
		
		Savings sa = new Savings();
		sa.setAmountTransferred(50000);
		sa.setNoOfTransactions(2);
		
		Current cur = new Current();
		cur.setAmountTransferred(800000);
		cur.setNoOfTransactions(10);
		

		session.beginTransaction();
		session.save(ba);
		session.save(sa);
		session.save(cur);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
