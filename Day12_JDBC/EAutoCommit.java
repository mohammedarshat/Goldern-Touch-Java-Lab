package Day12_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class EAutoCommit {

	public static void main(String[] args)throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
		System.out.println("Before Set auto commit it is not protected....");
		String str = "Update user set flag = 1";
		Statement stmt = con.createStatement();
		stmt.executeUpdate(str);
		con.setAutoCommit(false);
		System.out.println("After Auto commit....");
		String str1 = "Update user set flag = 2";
		stmt.executeUpdate(str1);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1 to Commit 2 to RollBack : ");
		int num = scan.nextInt();
		
		if(num == 1) {
			con.commit();
			System.out.println("Query updated....");
			
		}else if(num == 2){
			con.rollback();
			System.out.println("Not updated...");
		}
	}

}
