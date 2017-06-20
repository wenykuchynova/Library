package managers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import baseClasses.Reader;

public class ReaderManager {
	Connection conn;
	public ReaderManager(Connection conn){
		this.conn=conn;
		return;
	}
	
	
	public void addReader(Reader reader) throws SQLException{
		String insertCmd="insert into readers(name,surname,schoolClass,birthDate,note) values(+ '"+
	reader.getName()+"','"+
	reader.getSurname()+"','"+
	reader.getschoolClass()+"',"+
	reader.getBirthDate()+",'"+
	reader.getNote()+"','"+"');";
	Statement s = conn.createStatement();
	s.execute(insertCmd);
	s.close();
	
	}
	public void deleteReader(Reader reader) throws SQLException{
		String insertCmd="delete from readers where ID = reader.getID";
	Statement s = conn.createStatement();
	s.execute(insertCmd);
	s.close();
	}
	
	public void updateReader(Reader reader) throws SQLException{
		String insertCmd="update readers set name='"+reader.getName()+"', surname='"+reader.getSurname()+"', schoolClass='"+reader.getschoolClass()+"', birthDate='"+reader.getBirthDate()+"', note='"+reader.getNote()+"' where ID = reader.getID";
	Statement s = conn.createStatement();
	s.execute(insertCmd);
	s.close();
	}
}
