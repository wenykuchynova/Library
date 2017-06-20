package ultraManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import managers.BookManager;
import managers.LendingsManager;
import managers.ReaderManager;

public class UltraManager {
	public static BookManager bm;
	public static ReaderManager rm;
	public static LendingsManager lm;
	static Connection conn;
	String connectionUrl;
	String driver;
	String username;
	String pass;
	public static void connect(String connectionUrl, String username, String pass,  String JDBC_DRIVER) throws ClassNotFoundException, SQLException{
		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(connectionUrl,username,pass);
	}
	public static void close() throws ClassNotFoundException, SQLException{
		conn.close();
		}
	public static void initDB() throws ClassNotFoundException, SQLException{
		String sqlCmd="create table if not exists books(ID serial,authorName varchar,authorSurname varchar,title varchar ,year int,publisher varchar,price numeric(7,2),dateIn date,dateOut date,ISBN char(13),type varchar);";
				
				Statement s = conn.createStatement();
				s.execute(sqlCmd);
			 sqlCmd="create table if not exists readers(name varchar,surname varchar,schoolClass char(2),birthDate date,note varchar);";
				s.execute(sqlCmd);
				sqlCmd="create table if not exists lendings(dateLend date,dateBack date,readerID int,bookID int ,note varchar);";
				s.execute(sqlCmd);
						s.close();
		}
}
