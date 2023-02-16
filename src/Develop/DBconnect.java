package Develop;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

	public static void main(String[] args) {
		getConnection();
	}
	
	public static Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/information?serverTimezone=Asia/Seoul";
			String user = "root";
			String passwd = "hyorim0327!";
			String drivername = "com.mysql.cj.jdbc.Driver";
			Class.forName(drivername);
			Connection conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("good");
			return conn;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
