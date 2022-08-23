package Day17_Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BURL
 */
@WebServlet({ "/BURL", "/Arshat", "*.da" })
//http://localhost:8080/Aspire_Servlet_Project/a.do?request=Noname
//http://localhost:8080/Aspire_Servlet_Project/Arshat?request=noone
public class BURL extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("request");
		PrintWriter out = response.getWriter();	
		out.println("By defaul doGet it will call get method : "  + name );
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
