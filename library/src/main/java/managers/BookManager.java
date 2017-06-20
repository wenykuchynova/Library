package managers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import baseClasses.Book;

public class BookManager {
	Connection conn;
	public BookManager(Connection conn){
		this.conn=conn;
	}
	
	public void addBook(Book book) throws SQLException{
		String insertCmd="insert into books(authorName,authorSurname,title,year,publisher,price,dateIn,dateOut,ISBN,type) values('"+
	book.getAuthorName()+"','"+
	book.getAuthorSurname()+"','"+
	book.getTitle()+"',"+
	book.getYear()+",'"+
	book.getPublisher()+"',"+
	book.getPrice()+","+
	((book.getDateIn()==null)?("null,"):("'"+book.getDateIn().toString()+"',"))+
	((book.getDateOut()==null)?("null,'"):("'"+book.getDateOut().toString()+"','"))+
	book.getISBN()+"','"+
	book.getType()+"');"; 
	Statement s = conn.createStatement();
	s.execute(insertCmd);
	s.close();
	}
	public void deleteBook(Book book) throws SQLException{
		String insertCmd="delete from book where ID = book.getID";
	Statement s = conn.createStatement();
	s.execute(insertCmd);
	s.close();
	}
	public void updateBook(Book book) throws SQLException{
		String insertCmd="update books set authorName='"+book.getAuthorName()+"', authorSurname='"+book.getAuthorSurname()+"', title='"+book.getTitle()+"', year='"+book.getYear()+"', publisher='"+book.getPublisher()+"', price='"+book.getPrice()+"', dateIn='"+book.getDateIn()+"', dateOut='"+book.getDateOut()+"', type='"+book.getType()+"', ISBN='"+book.getISBN()+"' note='"+book.getNote()+"' where ID = book.getID";
	Statement s = conn.createStatement();
	s.execute(insertCmd);
	s.close();
	}
}
