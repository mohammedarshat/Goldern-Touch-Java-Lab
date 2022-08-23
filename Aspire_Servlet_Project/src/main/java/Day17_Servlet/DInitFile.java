package Day17_Servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DInitFile
 */
@WebServlet(
		urlPatterns = { "/DInitFile" }, 
		initParams = { 
				@WebInitParam(name = "myFile", value = "/WEB-INF/Day17_config.properties")
		})
public class DInitFile extends HttpServlet {
	@Override
		public void init(ServletConfig config) throws ServletException {
			String file = config.getInitParameter("myFile");
			System.out.println(file);	//it show file path
			ServletContext app = config.getServletContext();
			System.out.println(app.getRealPath(file));
			Properties pro = new Properties();
			try {
				pro.load(new FileInputStream(app.getRealPath(file)));
				System.out.println(pro.get("driver"));
				System.out.println(pro.get("username"));
				System.out.println(pro.get("pass"));
			}catch(Exception e) {
				
			}
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
