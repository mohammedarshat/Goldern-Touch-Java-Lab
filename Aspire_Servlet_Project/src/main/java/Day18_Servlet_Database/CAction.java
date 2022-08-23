package Day18_Servlet_Database;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class CAction {
	public abstract String execute(HttpServletRequest request , HttpServletResponse response );
}
