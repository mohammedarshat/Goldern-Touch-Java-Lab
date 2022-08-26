package Day18_Login_Register;

import javax.servlet.http.HttpServletRequest;

public class ActionRegister extends Action {
	@Override
	public String execute(HttpServletRequest request, HttpServletRequest response) {
		try {
		
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		String city = request.getParameter("ucity");


		Database dataBase = new Database();
//		int i = dataBase.userRegistration(uid, name, pass, city, flag);
		dataBase.userRegistration(name, pass, city);
//		if (i == 1) {
			return "register.success";

//		} else {
//			return "register.failed";
//		}
		}catch(Exception e) {
			return "register.failed";
		}
	}
}
