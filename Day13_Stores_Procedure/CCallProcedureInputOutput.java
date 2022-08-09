package Day13_Stores_Procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class CCallProcedureInputOutput {

	public static void main(String[] args) throws Exception{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas","root","root");
		
		CallableStatement cs = con.prepareCall("{call proc3( ? ,?)}");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ente the name : ");
		String name = scan.next();
		cs.setString(1, name);
		cs.registerOutParameter(2,Types.INTEGER);
		 boolean values = cs.execute();
		 System.out.println("It always retuen you false : " + values);
		int flag = cs.getInt(2);
		System.out.println("Enter Name Flag value : " + flag + "\n--------------------------------");
		
		Statement stmt = con.createStatement();
		values = stmt.execute("Select * from users");
		System.out.println("This will return true only this specfic condition : " + values);
	}

}
