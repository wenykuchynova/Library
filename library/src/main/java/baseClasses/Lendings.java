package baseClasses;

import java.util.Date;

public class Lendings {
	Date dateLend;
	Date dateBack;
	Reader reader;
	Book book;
	String note;
	int ID;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Date getDateLend() {
		return dateLend;
	}
	public void setDateLend(Date dateLend) {
		this.dateLend = dateLend;
	}
	public Date getDateBack() {
		return dateBack;
	}
	public void setDateBack(Date dateBack) {
		this.dateBack = dateBack;
	}
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
