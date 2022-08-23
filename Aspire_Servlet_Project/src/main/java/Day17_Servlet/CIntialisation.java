package Day17_Servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CIntialisation
 */
@WebServlet(
		urlPatterns = { "/CIntialisation" }, 
		initParams = { 
				@WebInitParam(name = "driver", value = "com.mysql.cj.jdbc.Driver"), 
				@WebInitParam(name = "MyBestFriend", value = "Mom")
		})
public class CIntialisation extends HttpServlet {
	@Override
		public void init(ServletConfig config) throws ServletException {
			String myDriver = config.getInitParameter("driver");
			String friend = config.getInitParameter("MyBestFriend");
			System.out.println("Driver : " + myDriver +  "\nFriend : " + friend);
		
		}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
