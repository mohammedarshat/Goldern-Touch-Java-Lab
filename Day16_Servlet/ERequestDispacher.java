package Day16_Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ERequestDispacher
 */
@WebServlet("/ERequestDispacher")
public class ERequestDispacher extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num = request.getParameter("number");
		int n = Integer.parseInt(num);
		if(n%2 != 0) {
			RequestDispatcher rd = request.getRequestDispatcher("Day16_DRedirectPageRed.html");
			rd.forward(request, response);
//			Same page see both diffrent
//			http://localhost:8080/Aspire_Servlet_Project/ERequestDispacher?number=101
		}else {
			response.sendRedirect("Day16_DRedirectPageBlue.html");		
//			Check URL page change
//			http://localhost:8080/Aspire_Servlet_Project/ERequestDispacher?number=100
//			http://localhost:8080/Aspire_Servlet_Project/Day16_DRedirectPageBlue.html
		}
	}

}
