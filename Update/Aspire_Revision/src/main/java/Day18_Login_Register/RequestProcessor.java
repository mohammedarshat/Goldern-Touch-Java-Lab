package Day18_Login_Register;

import java.io.FileInputStream;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestProcessor  {
	public void process(HttpServletRequest request , HttpServletResponse response) {
	
//		1. We want to identify real path using ServletContext
//		2. We want to load confid properties
//		3. Getting formid using request
//		4. We TypeCasting Action class 
//		5. Run Html page Output
		
//		1. identify Real Path 
		
//		1. User ServletContext to get Servlet Context that we getting into app variable.
//		2. Using that variable we get realpath of given properties
//		3. We Storeing the real "\D\lib\blabla" path into myConfigPath
		
		
//		String myConfig = request.getParameter("");
		ServletContext app = request.getServletContext();
		String myConfigPath = app.getRealPath("/WEB-INF/Day18_config.properties");
		System.out.println("Now myConfigPath contain real path of config properties : " + myConfigPath);
		
//		2. Load Properties
		
//		1. If we want to load pro9perties first we want to create object properties, using properties class
//		2. using object we loading config file 
		try {
		Properties propertiesLoad = new Properties();
		propertiesLoad.load(new FileInputStream(myConfigPath));
		
//		3. Getting formid using request 
		
//		1. Formid contain value
//			Example  : we take value is login
//					   login contain class name
//					   That all config into config file
//					   So using config file going to get real data
//		2. Then using propertiesLoad.getProperty we get real value
					   
		
		String formId_Get_From_HtmlPage = request.getParameter("formId");
		String 	getting_Assigning_Value_From_ConfigFile	= propertiesLoad.getProperty(formId_Get_From_HtmlPage);
		
//		4. We TypeCasting Action class 
		
//		1. getting_Assigning_Value_From_ConfigFile it is in string format same time it is qulified class name so we use Class.forName
//		2. Then run the class by request
		
		Class cl = Class.forName(getting_Assigning_Value_From_ConfigFile);
		Object obj  = cl.newInstance();
		Action action = (Action) obj;
//		each and every class get request and give response
		
		String result = action.execute(request, request);
		String resultConfigValue = propertiesLoad.getProperty(result);
		
//		5. Run Html page Output
		
//		1. Then result give html format run it on same page we using RequestDispatcher or response.sendRedirect(resultConfigValue);
		

		
		RequestDispatcher rd = request.getRequestDispatcher(resultConfigValue);
		rd.forward(request, response);
		
//		response.sendRedirect(resultConfigValue);		
		}catch(Exception e) {
			
		}
	}
}
