package Day18_Servlet_Database;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FRegisterAction extends CAction{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		int uid = Integer.parseInt(request.getParameter("uuid"));
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		String city = request.getParameter("ucity");
		int flag = Integer.parseInt(request.getParameter("uflag"));
		
		EDatabase edb = new EDatabase();
		int add = edb.register(uid, name, pass, city, flag);
		if (add == 1) {
			return "register.success";
		}else {
			return "register.failure";
		}
		
	}
}
