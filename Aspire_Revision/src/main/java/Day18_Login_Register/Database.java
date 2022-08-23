package Day18_Login_Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

	public Database() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {

		}
	}

	public boolean checkUser(String name, String password) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
			String sql = "SELECT * FROM users WHERE uname = ? AND upass = ? ";
			String sql1 = "UPDATE users SET flag  = 1 WHERE uname = ?";
			
		
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
		
			if (rs.next()) {
				PreparedStatement ps1 = con.prepareStatement(sql1);
				ps1.setString(1, name);
				ps1.executeUpdate();
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public int userRegistration(int uid, String name, String password, String city, int flag) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
			String sql = "INSERT INTO USERS VALUES (? , ? , ? , ? , ? ) ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, uid);
			ps.setString(2, name);
			ps.setString(3, password);
			ps.setString(4, city);
			ps.setInt(5, flag);
			int i = ps.executeUpdate();
			if (i == 1) {
				return i;
			} else {
				return 0;
			}
		} catch (Exception e) {
			return 0;
		}
	}
	
	public int userLogOut(String names) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
			String sql =  "UPDATE users SET flag = 0 WHERE uname = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1 , names);
			int i = ps.executeUpdate();
			if (i == 1) {
				return i;
			} else {
				return 0;
			}
		} catch (Exception e) {
			return 0;
		}
	}
	public static void main(String[] args) {
//		Database db = new Database();
//		db.checkUser("zaman", "no");
//		db.userLogOut();
//		System.out.println(new Database().checkUser("zaman", "no" ));
//		System.out.println(new Database().userRegistration(27,"zamil", "no" , "dubai" , 0));
	}
}
