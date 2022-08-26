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
		boolean value1 = dataBase.alreadyLogin(userName);
		boolean value = dataBase.checkUser(userName, password);
		if (!value1) {
			if (value) {
				HttpSession session = request.getSession();
				session.setAttribute("name", userName);
				dataBase.notAlreadyLogin(userName);
				return "login.success";
			} else {
				return "login.failed";
			}
		} else {
			return "login.already";
		}

	}
//	public static void main(String[] args) {
//		Database dataBase = new Database();
//		boolean value1 = dataBase.alreadyLogin("Arshat");
//		System.out.println(value1);
//		if (!value1) {
//			System.out.println("hai");
//		}
//	}

}
