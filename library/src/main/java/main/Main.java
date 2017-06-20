package main;
import java.sql.SQLException;

import baseClasses.Book;

public class Main {
	public static void main( String[] args ) throws ClassNotFoundException, SQLException {
		Book book=new Book();
		book.setAuthorName("John");
		book.setAuthorSurname("Steinbeck");
		book.setTitle("Grapes of Wrath");
        ultraManager.UltraManager.connect("jdbc:postgresql://192.168.1.13/library","wendy","wk","org.postgresql.Driver");
        System.out.println( "Hello World!" );
        ultraManager.UltraManager.initDB();
        ultraManager.UltraManager.bm.addBook(book);
        ultraManager.UltraManager.close();
    }
}
