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

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public boolean alreadyLogin(String names) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
			String sql = "select uname from users where flag = 1 and uname = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, names);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public boolean notAlreadyLogin(String names) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
			String sql = "UPDATE users SET flag  = 1 WHERE uname = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, names);
			int i = ps.executeUpdate();
			if (i == 1) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public boolean userLogOut(String name) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
			String sql1 = "UPDATE users SET flag  = 0 WHERE uname = ?";
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1, name);
			ps1.executeUpdate();
			int i = ps1.executeUpdate();
			if (i == 1) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public boolean userRegistration(String name, String password, String city) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javas", "root", "root");
			String sql = "INSERT INTO USERS(uname , upass, city) VALUES (? , ? , ?  ) ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, city);

			int i = ps.executeUpdate();
			if (i == 1) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(new Database().alreadyLogin("Abitha"));
//		Database db = new Database();
//		db.checkUser("zaman", "no");
//		db.userLogOut();
//		System.out.println(new Database().checkUser("zaman", "no" ));
//		System.out.println(new Database().userRegistration("zamil", "no" , "dubai"));
	}
}
