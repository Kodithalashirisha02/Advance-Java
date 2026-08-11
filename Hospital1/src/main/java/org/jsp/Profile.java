package org.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/profile")
public class Profile extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		HttpSession session=req.getSession();
		String name=(String)session.getAttribute("name");
		String db_email=(String)session.getAttribute("email");
		String password=(String)session.getAttribute("number");
		long number=(long)session.getAttribute("number");
		out.println("<form action='update' method='post'>");
		out.println("Name:<input type='text' name='name' value"+name+">");
		out.println("<br>");
		out.println("Email:<input type='email' name='email' value"+db_email+">");
		out.println("<br>");
		out.println("Name:<input type='password' name='password' value"+password+">");
		out.println("<br>");
		out.println("Number:<input type='text' name='name' value"+number+">");
		out.println("<br>");
		out.println("<button>Update</button>");
		out.println("</form>");
		out.println("</html>");
		out.println("</body>");
		
		
	}
	

}
