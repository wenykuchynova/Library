package ultraManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import managers.BookManager;
import managers.LendingsManager;
import managers.ReaderManager;

public class UltraManager {
	public static BookManager bm=null; 
	public static ReaderManager rm=null;
	public static LendingsManager lm=null;
	static Connection conn;
	String connectionUrl;
	String driver;
	String username;
	String pass;
	public static void connect(String connectionUrl, String username, String pass,  String JDBC_DRIVER) throws ClassNotFoundException, SQLException{
		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(connectionUrl,username,pass);
		bm = new BookManager(conn);
		rm = new managers.ReaderManager(conn);
		lm = new LendingsManager(conn);
	}
	public static void close() throws ClassNotFoundException, SQLException{
		conn.close();
		}
	public static void initDB() throws ClassNotFoundException, SQLException{
		String sqlCmd="create table if not exists books(ID serial,authorName varchar,authorSurname varchar,title varchar ,year int,publisher varchar,price numeric(7,2),dateIn date null,dateOut date null,ISBN char(13),type varchar);";
				
				Statement s = conn.createStatement();
				s.execute(sqlCmd);
			 sqlCmd="create table if not exists readers(name varchar,surname varchar,schoolClass char(2),birthDate date null,note varchar);";
				s.execute(sqlCmd);
				sqlCmd="create table if not exists lendings(dateLend date null,dateBack date null,readerID int,bookID int ,note varchar);";
				s.execute(sqlCmd);
						s.close();
		}
}
