package managers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import baseClasses.Lendings;

public class LendingsManager {
	Connection conn;
	
	public void addLending(Lendings lending) throws SQLException{
		String insertCmd="insert into lendings(dateLend,dateBack,readerID,bookID,note) values(+ '"+
	lending.getDateLend()+"','"+
	lending.getDateBack()+"','"+
	lending.getReader()+"',"+
	lending.getBook()+",'"+
	lending.getNote()+"','"+"');"; 
	Statement s = conn.createStatement();
	s.execute(insertCmd);
	s.close();
	}
	public void deleteLending(Lendings lending) throws SQLException{
		String insertCmd="delete from lendings where ID = lendings.getID";
	Statement s = conn.createStatement();
	s.execute(insertCmd);
	s.close();
	}
	public void updateLending(Lendings lending) throws SQLException{
		
		String insertCmd="update lendings set dateLend='"+lending.getDateLend()+"',dateBack='"+ lending.getDateBack()+"', reader='"+ lending.getReader()+"', book='"+ lending.getBook()+"', note='"+ lending.getNote()+"' where ID = lending.getID";
	Statement s = conn.createStatement();
	s.execute(insertCmd);
	s.close();
	}
	
}
