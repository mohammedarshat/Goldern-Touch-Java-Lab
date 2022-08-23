package Day17_Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class APrintWritter
 */
@WebServlet("/APrintWritter")
public class APrintWritter extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("request");
		PrintWriter out = response.getWriter();	//JSP writter  //charter steam
//		ServletOutputStream out = response.getOutputStream(); // byte stream 
		out.println("By defaul doGet it will call get method : "  + name );
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
