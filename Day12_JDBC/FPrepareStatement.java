package Day12_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class FPrepareStatement {

	public static void main(String[] args)throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter flag updation value : ");
		int fg = scan.nextInt();
		String name = scan.next();
//		String str = "Update user set flag =" + fg; // this type of dynamisem not allowed .this can lead to problem called SQL injection - A secutiy problem
		String str = "Select * from user where flag = ?";
		PreparedStatement ps = con.prepareStatement(str);
		ps.setInt(1, fg);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println("flag : " + rs.getString(2));
		}
//		Statement stmt = con.createStatement();
//		System.out.println("Query updated : " + stmt.executeUpdate(str));
	}

}
