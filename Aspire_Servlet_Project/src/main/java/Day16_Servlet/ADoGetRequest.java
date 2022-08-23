package Day16_Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ADoGetRequest
 */
@WebServlet("/ADoGetRequest")
public class ADoGetRequest extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("request");
		System.out.println("By defaul doGet it will call get method : "  + name );
//		System.out.println("By defaul doGet it will call get method : " );
//		doPost(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("request");
		System.out.println("Do post value called : " + name);
	}

}
