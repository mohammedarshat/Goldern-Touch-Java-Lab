package Day13_Stores_Procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ACallProcedure {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas" , "root" ,"root");
		CallableStatement cs = con.prepareCall("{call proc1()}");
		
//		=================COMMANDPAD STORE PROCEDURE CREATE=================
//				-> delimiter //
//				-> create procedure proc1()
//			    -> begin
//			    -> update users set flag = 2;
//			    -> end;
//			    -> //
				
//				-> CALL STORE PROCEDURE
		
//				-> delimiter ;
//				-> call proc1();
//		=================COMMANDPAD PROCEDURE CREATE=================
			    
		int num = cs.executeUpdate();
		System.out.println("Update rows : " + num);
	}

}
