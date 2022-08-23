package Day18_Login_Register;

import javax.servlet.http.HttpServletRequest;

public class ActionRegister extends Action {
	@Override
	public String execute(HttpServletRequest request, HttpServletRequest response) {
		try {
		int uid = Integer.parseInt(request.getParameter("uuid"));
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		String city = request.getParameter("ucity");
		int flag = Integer.parseInt(request.getParameter("uflag"));

		Database dataBase = new Database();
//		int i = dataBase.userRegistration(uid, name, pass, city, flag);
		dataBase.userRegistration(uid, name, pass, city, flag);
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
