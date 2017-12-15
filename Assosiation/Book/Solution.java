package com.book;

import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
      
        
        Book book=new Book();
        book.setId(1);
        book.setTitle("harry potter");
        book.setPrice(76.9);
        book.setIsbnno("654678");
        book.setPublisher("dodo");
        book.setEdition("1st Edition");
        
        Book book1=new Book();
        book1.setId(2);
        book1.setTitle("two states");
        book1.setPrice(655.7);
        book1.setIsbnno("6732372");
        book1.setPublisher("guido");
        book1.setEdition("3rd Edition");
        
        Ebook ebook=new Ebook();
        ebook.setDownloadurl("book_downloads");
        ebook.setSize_in_mb(256);
        
        
        Ebook ebook1=new Ebook();
        ebook1.setDownloadurl("software_downloads");
        ebook1.setSize_in_mb(45287);
        
        PaperBook paper=new PaperBook();
        paper.setShipping_weight(245);
        paper.setInstock(3);
        
        PaperBook paper1=new PaperBook();
        paper1.setShipping_weight(67.8f);
        paper1.setInstock(2);
        
        session.beginTransaction();
        
        session.save(book);
        session.save(book1);
        session.save(ebook);
        session.save(ebook1);
        session.save(paper);
        session.save(paper1);
        
        session.getTransaction().commit();
        session.close();
        sf.close();
        
	}

}

