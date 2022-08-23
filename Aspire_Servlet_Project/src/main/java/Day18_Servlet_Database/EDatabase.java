package Day18_Servlet_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EDatabase {
	public EDatabase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {

		}
	}

	public boolean checkUser(String uname, String upass) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
			
			PreparedStatement ps = con.prepareStatement("Select * from users where uname = ? AND upass = ?");
			ps.setString(1, uname);
			ps.setString(2, upass);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	
	}

	public int register(int uid, String uname, String upass, String city, int flag) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
			String sql = "insert into users values(? , ? , ? , ? , ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, uid);
			ps.setString(2, uname);
			ps.setString(3, upass);
			ps.setString(4, city);
			ps.setInt(5, flag);
			int i = ps.executeUpdate();
			System.out.println(i);
			return i;
		} catch (Exception e) {
			return 0;
		}
	}
	public static void main(String[] args) {
		new EDatabase().register(22, "Ali khan", "Secret", "England", 0);
//		System.out.println(new EDatabase().checkUser("Arshat", "lareen"));;
	}
}
