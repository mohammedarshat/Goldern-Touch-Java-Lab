package Day13_Stores_Procedure;

//Note :
//			Flag number change

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class BCallProcedureUserInput {

	public static void main(String[] args)throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas" , "root" ,"root");
		CallableStatement cs = con.prepareCall("{call proc2( ? ,? )}");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Name of which flag you want to change : ");
		String myname = scan.next();
		System.out.print("Enter the flag number : ");
		int myflag = scan.nextInt();
		cs.setString(1 , myname);
		cs.setInt(2 , myflag);
		
//		=================COMMANDPAD STORE PROCEDURE CREATE=================
//				-> delimiter //
//				-> create procedure proc2(IN myname varchar(20) , IN myflag int)
//	    		-> begin
//	    		-> update users set flag = myflag where uname = myname;
//	    		-> end;
//	    		-> //
				
//				-> CALL STORE PROCEDURE
		
//				
//				-> delimiter ;
//				-> call proc2(1 , "Arshat");
//		=================COMMANDPAD PROCEDURE CREATE=================
			    
		int num = cs.executeUpdate();
		System.out.println("Update rows : " + num);
	}

}
