package org.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet("update")
public class Update extends HttpServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String str_number=req.getParameter("number");
		long number=Long.parseLong(str_number);
		PrintWriter out=res.getWriter();
		out.println("<html>");
		out.println("<body>");
		//long number=long.parseLong(req.getParameter("number");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospita1";
			String userName="root";
			String userpassword="root";
			Connection connection=DriverManager.getConnection(url,userName,password);
			PreparedStatement statement=connection.prepareStatement("Update staff SET name=?,email=?,pasword=?,number= ? where email=?");
			statement.setString(1, name);
			statement.setString(2, email);
			statement.setString(3, password);
			statement.setLong(4, number);
			statement.setString(5, email);
			
			statement.executeUpdate();
			
			//res.sendRedirect("profile");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	out.println("</body>");
	out.println("</html>");
}

}
