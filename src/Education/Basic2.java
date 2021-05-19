package Education;
import java.io.IOException;
import java.io.PrintWriter;
//import java.servlet.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Basic2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public void init() throws ServletException
	{
	  msg="Hi Everyone! I am Isha Raghuvanshi. I welcome you to my project.";
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1>"+msg+"<h1>");
	}
	public void destroy() {}
}
