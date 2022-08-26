package Day18_Login_Register;

import javax.servlet.http.HttpServletRequest;

public abstract class Action {
	public abstract String execute(HttpServletRequest request , HttpServletRequest response);
}
