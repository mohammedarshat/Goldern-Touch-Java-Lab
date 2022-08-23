package Day18_Servlet_Database;

import java.io.FileInputStream;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BRequestProcessor {

	public void process(HttpServletRequest request , HttpServletResponse response) {
		try {
//			FIRST PART
			System.out.println("called...");
			ServletContext app = request.getServletContext();
			String myConfigPath = app.getRealPath("/WEB-INF/Day18_Aconfig.properties");
			Properties pro = new Properties();
			pro.load(new FileInputStream(myConfigPath));
			
//			SECOUND PATH
			String myFormid = request.getParameter("formid"); //This "formid" in every html page -//formId == login
			String name = request.getParameter("uname"); //html page uname
			System.out.println(name); //null
			System.out.println(myFormid); //login
			String actionClassName = pro.getProperty(myFormid);
			System.out.println(actionClassName);	//Day18_Servlet_Database.DLoginAction
			
			//why we use action means its is reusable we can run all code which are extend cAction
			CAction cAction = (CAction) Class.forName(actionClassName).newInstance();
			System.out.println("here we priniting class name :" + cAction);	//Day18_Servlet_Database.DLoginAction@370116a
			String result = cAction.execute(request, response);	//DLoginAction.execute(request, response)
//			String result = cAction.demo();	//Dataloss
			System.out.println("here we get return value : " + result);	//login.register
			
			String nextpage = pro.getProperty(result);
//			here we link with the help of properties : Day18_Dwelcome.html
			System.out.println("here we link with the help of properties : " + nextpage);
			
			//if u want print the html file we need redirect or use request dipacher
			RequestDispatcher rd = request.getRequestDispatcher(nextpage);
			rd.forward(request, response);
//			response.sendRedirect(nextpage);
		}catch(Exception e) {
			System.err.println("catch file....");
		}
	}


}
