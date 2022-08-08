package Day12_JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;

public class BJDBCCreateTable {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
//		String drop = "drop table Bio";
		String create = "create table Bio (Name varchar(20) , Age int)";
		String insert = "insert into Bio values('Arshat' , 23)";
		String insert1 = "insert into Bio values('Ijas' , 18)";
		String delete = "delete from bio where age = 20";
		String update = "update bio set age = 20 where age = 23 ";
		String query = "Select * from bio";
		Statement stmt = con.createStatement();
//		System.out.println(stmt.executeUpdate(drop));
//		System.out.println(stmt.executeUpdate(create));
//		System.out.println(stmt.executeUpdate(insert));
		System.out.println(stmt.executeUpdate(update));
		System.out.println(stmt.executeUpdate(delete));
//		System.out.println(stmt.executeUpdate(insert1));
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			System.out.println("Name : " + rs.getString(1) + " Age : " + rs.getInt(2));
		}

	}

}
