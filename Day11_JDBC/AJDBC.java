package Day11_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AJDBC {

	public static void main(String[] args) throws Exception{
		 /**
		    
		    1. Load or register the Drive - Note : This should be done only one.
		    
		    2. Establish a Connection
		    
		    3. Prepare and Execute a Statement
		    
		    4. Process the result
		    
		  */
		
//		1. Load or register the Drive - Note : This should be done only one.
	
		Class.forName("com.mysql.cj.jdbc.Driver");

//	    2. Establish a Connection
		
//		(URL:"protocol:db://ipaddress/dbname" ,"username" ,"password");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas" , "root" , "root");
		
		System.out.println("Connection made Successfully.... " + con);
		
		String str = "Select * from javaprogaram";

		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(str);
		while (rs.next()) {
		System.out.println("Name : " + rs.getString(1) + " Roll_No : " + rs.getInt(2) + " Address : " + rs.getString(3)+ " Mobile_No : " + rs.getInt(4));
		}
		
		System.out.println("--------------------------------------");
		
		if(rs.next()) {
			System.out.println("Name : " + rs.getString(1) + " Roll_No : " + rs.getInt(2) + " Address : " + rs.getString(3)+ " Mobile_No : " + rs.getInt(4));
			}
		
		System.out.println("--------------------------------------");
		
		String str1 = "Select * from javaprogaram where roll_no = 1";
		ResultSet rs1 = stmt.executeQuery(str1);
		
		while (rs1.next()) {
		System.out.println("Name : " + rs1.getString(1) + " Roll_No : " + rs1.getInt(2) + " Address : " + rs1.getString(3)+ " Mobile_No : " + rs1.getInt(4));
		}
		
		System.out.println("--------------------------------------");
		
		String str2 = "Select Student_name , Address from javaprogaram where Student_name = 'arshat'";
		ResultSet rs2 = stmt.executeQuery(str2);
		
		while (rs2.next()) {
		System.out.println("Name : " + rs2.getString(1) +  " Address : " + rs2.getString(2));
		}
	
	}

}
