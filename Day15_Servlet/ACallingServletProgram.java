package Day15_Servlet;

import java.net.URL;
import java.net.URLConnection;

public class ACallingServletProgram {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:8080/Day15_Servlet/AHelloServlet");
		URLConnection urlcon = url.openConnection();
		urlcon.getInputStream();
	}

}
