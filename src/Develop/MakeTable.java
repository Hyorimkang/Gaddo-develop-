package Develop;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MakeTable extends DBconnect {

	
	public static void main(String[] args) {
		new MakeTable();
	}
	
	public MakeTable() {
		String name = "second";
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement(
					"CREATE TABLE IF NOT EXISTS"
					+ name + "(country varChar(255),"
							+ "area varChar(255),"
							+ "year int NOT NULL, AUTO_INCREMENT,"
							+ "month int NOT NULL,"
							+ "date int NOT NULL)");
			create.execute();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("goodddd");
		}
	}

}
