package Day18_Servlet_Database;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DLoginAction extends CAction {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
//		if (name.equals("ram")) {
//			return "login.success";
//		}else {
//			
//			return "login.register";
//		}
//		EDatabase edb = new EDataBase();
		EDatabase edb = new EDatabase();
		boolean value = edb.checkUser(name, pass);
		System.out.println("DLoginAction value : " +value);
		if(value) {
			return "login.success";
			
		}else {
			return "login.register";
		}
		
	}
	public void demo() {
		
	}
}
