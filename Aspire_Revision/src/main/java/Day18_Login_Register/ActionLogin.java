package Day18_Login_Register;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ActionLogin extends Action {
	@Override
	public String execute(HttpServletRequest request, HttpServletRequest response) {
		String userName = request.getParameter("uname");
		String password = request.getParameter("upass");

//		if (userName.equalsIgnoreCase("arshat") && password.equals("lareen")) {
//			return "Day18_welcomePage.html";
//		}else {
//			return null;
//		}
//		if (userName.equalsIgnoreCase("arshat") && password.equals("lareen")) {
//			return "login.success";
//		}else {
//			return "register.page"; 
//		}
		Database dataBase = new Database();
		boolean value = dataBase.checkUser(userName, password);
		if(value) {
			HttpSession session = request.getSession();
			session.setAttribute(userName, "name");
			return "login.success";
		}else {
			return "login.failed";			
		}
	}

}
