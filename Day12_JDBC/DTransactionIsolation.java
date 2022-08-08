package Day12_JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DTransactionIsolation {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
		DatabaseMetaData dmd = con.getMetaData();
		con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
		System.out.println("for IRCTC website....");
		System.out.println("This is my connection isolation : " + con.getTransactionIsolation());
		con.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
		System.out.println("for  Ticket counter....");
		System.out.println("Reservation counter connection : " + con.getTransactionIsolation());
		System.out.println(con.getTransactionIsolation());	
		System.out.println("Default isolation Connection : \n" + dmd.getDefaultTransactionIsolation());
		con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
		System.out.println(con.getTransactionIsolation());
	}

}
