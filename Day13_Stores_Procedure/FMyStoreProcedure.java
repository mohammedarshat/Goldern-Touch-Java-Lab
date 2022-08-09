package Day13_Stores_Procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class FMyStoreProcedure {

	public static void main(String[] args)throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas" , "root" ,"root");
		CallableStatement cs = con.prepareCall("{call pro0( ? )}");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Name which want to delete : ");
		String myname = scan.next();
		cs.setString(1 , myname);
		
		int num = cs.executeUpdate();
		System.out.println("Number of rows updated : " + num);
		
		
	}

}
