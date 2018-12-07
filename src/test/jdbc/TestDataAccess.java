package test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDataAccess {
	public static void main (String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("test.jdbc.TestDriver");
		Connection conn = DriverManager.getConnection("");
		Statement stmt = conn.createStatement();
		stmt.executeQuery("select * from test");
		//Class.forName("com.mysql.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("");
//		Statement stmt = conn.createStatement();
//		stmt.executeQuery("select * from test");
	}
}
