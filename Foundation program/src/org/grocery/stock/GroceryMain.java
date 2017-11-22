package org.grocery.stock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GroceryMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		/*Item item = session.get(Item.class, 3);
		System.out.println("Item Name : " + item.getName());
		System.out.println("Item Quantity : " + item.getQuantity());
		System.out.println("Item Price : " + item.getPrice());
		session.beginTransaction();
		item.setName("Paste");
		item.setPrice(10);
		session.update(item);
		session.getTransaction().commit();
		System.out.println("Updated");*/
		session.beginTransaction();
		Item item = new Item();
		item.setId(2);
		session.delete(item);
		session.getTransaction().commit();
		System.out.println("Deleted");
		/*while (true) {
			
			System.out.print("Enter Choice : ");
			int choice = Integer.valueOf(bf.readLine());
			switch (choice) {
			case 1:
				Item item = new Item();

				session.beginTransaction();
				System.out.print("Enter Name : ");
				String name = bf.readLine();
				System.out.print("Enter Quantity : ");
				int quantity = Integer.valueOf(bf.readLine());
				System.out.print("Enter Price : ");
				double price = Double.valueOf(bf.readLine());
				item.setName(name);
				item.setPrice(price);
				item.setQuantity(quantity);
				System.out.println("Item Name : " + item.getName());
				System.out.println("Item Quantity : " + item.getQuantity());
				System.out.println("Item Price : " + item.getPrice());
				session.save(item);
				session.getTransaction().commit();
				break;

			case 2:
				System.out.println(Item.getTotalNoOfProducts());
				break;

			default:
				break;
			}
		}*/

	}

}
