package Day16_Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DRedirectPage
 */
@WebServlet("/DRedirectPage")
public class DRedirectPage extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num = request.getParameter("number");
		int n = Integer.parseInt(num);
		if(n%2 != 0) {
			response.sendRedirect("Day16_DRedirectPageBlue.html");		
		}else {
			response.sendRedirect("Day16_DRedirectPageRed.html");
		}
	}

}
