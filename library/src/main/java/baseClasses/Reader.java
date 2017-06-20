package baseClasses;

import java.util.Date;

public class Reader {

	String name;
	String surname;
	String schoolClass;
	Date birthDate;
	int ID;
	String note;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getschoolClass() {
		return schoolClass;
	}
	public void setschoolClass(String class1) {
		schoolClass = class1;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
