package Day18_Login_Register;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ActionLogout extends Action{
	@Override
	public String execute(HttpServletRequest request, HttpServletRequest response) {
		HttpSession session=request.getSession();
		String name = (String)session.getAttribute("name");
		Database dataBase = new Database();
		int i = dataBase.userLogOut(name);
		if(i == 1) {
			session.invalidate();
			return "logout.success";
		}else {
			return "logout.exit";
		}
		
	}

}
