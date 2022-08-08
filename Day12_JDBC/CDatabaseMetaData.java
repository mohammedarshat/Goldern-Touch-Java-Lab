package Day12_JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class CDatabaseMetaData {

	public static void main(String[] args) throws Exception{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
		DatabaseMetaData dmd = con.getMetaData();
		System.out.println(dmd.getDatabaseProductName());
		System.out.println(dmd.getDriverName());
		System.out.println(dmd.getDriverVersion());
		System.out.println(dmd.getUserName());
		System.out.println(dmd.getDefaultTransactionIsolation());
	}

}
