package Day13_Stores_Procedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZTest {
		static boolean flag;
	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas" , "root" ,"root");
//		String sqlCreateTable = "create table users(uid int , uname varchar(20) , upass varchar(20) ,city varchar(20) , flag int)";
		Statement stmt = con.createStatement();
		String sqlInserValue = "insert into users values(? , ? , ? , ? , ?)";
		PreparedStatement ps = con.prepareStatement(sqlInserValue);
//		stmt.executeUpdate(sqlCreateTable);
		
		
	
		while(!flag) {
	
			System.out.print("Enter the uid : ");
			int uid = scan.nextInt();
			System.out.print("Enter the uname : ");
			String uname = scan.next();
			if(uname.equals("no")) {
				flag = true;
			}
			System.out.print("Enter the upass : ");
			String upass = scan.next();
			System.out.print("Enter the city : ");
			String city = scan.next();
			System.out.print("Enter the flag : ");
			int flag = scan.nextInt();
			
			
		
			ps.setInt(1 , uid );
			ps.setString(2, uname);
			ps.setString(3, upass);
			ps.setString(4, city);
			ps.setInt(5 , flag );
			
			int n = ps.executeUpdate();
			System.out.println("Number of rows insert : " + n);
			System.out.println("\nValues Insert Successfully..... \n");
			System.out.println("-------------------------------- \n");
			
		}
		
		
	}

}
