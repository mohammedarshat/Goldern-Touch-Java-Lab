package Day16_Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CWebsitrePrint
 */
@WebServlet("/CWebsitrePrint")
public class CWebsitrePrint extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num = request.getParameter("number");
		ServletOutputStream out = response.getOutputStream();
		int n = Integer.parseInt(num);
		if(n%2 != 0) {
		out.println("<h1 style = ' color : blue ' > Odd Number : </h1> " + n);
		}else {
		out.println("<h1 style = ' color : red ' > Even Number : </h1> " + n);
		}
	}

}
