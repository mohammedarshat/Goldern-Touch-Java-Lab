package Day17_Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ESession
 */
@WebServlet("/ESession")
public class ESession extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ServletOutputStream out = response.getOutputStream();
		Object obj = session.getAttribute("count");
		if(obj == null) {
			out.println("<h1>Welcome first time... </h1>");
			session.setAttribute("count", 1); //Set value 
		}else {
			int c = Integer.parseInt(obj.toString());
			c++;
			out.println("<h1> You visting this page " + c + " times..... </h1>");
			session.setAttribute("count", c); //Set value
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
