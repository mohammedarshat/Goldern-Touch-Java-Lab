package Day12_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FFPrepareStatementInsertValue {
	public static void main(String[] args)throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
		Scanner scan = new Scanner(System.in);
		String str = "insert into user values(?,?)";
		PreparedStatement ps = con.prepareStatement(str);
		while(true) {
		System.out.print("Enter the Name : ");
		String name = scan.next();
		System.out.print("Enter flag updation value : ");
		int fg = scan.nextInt();
		ps.setInt(2 , fg);
		ps.setString(1 , name);
		int no = ps.executeUpdate();
			System.out.println("Numberber of query update : " + no);	
		}
	}

}
