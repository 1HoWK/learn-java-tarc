package Practical4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBtesting {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:derby:collegedb;create=true";
		try {
			Connection connection = DriverManager.getConnection(jdbcURL);
			System.out.println("New Derby database created");
			//String sql = "Create Table products (id int not null generated always as identity, " + " name varchar(128), price float)";
			//String sql = "Insert into products (name, price) values ('iphone 12 pro', 3500)";
			Statement statement = connection.createStatement();
//			int rows = statement.executeUpdate(sql);
//			if (rows > 0) {
//				System.out.println("A row created.");
//			}
			
//			String shutdownURL = "jdbc:derby:;shutdown=true";
//			DriverManager.getConnection(shutdownURL);
		}catch(SQLException ex) {
//			if(ex.getSQLState().equals("XJ015")) {
//				System.out.println("Derby shutdown normally.");
//
//			}else {
//				ex.printStackTrace();
//			}
			ex.printStackTrace();
			
		}

	}

}
