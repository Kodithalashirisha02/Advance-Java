package org.jsp;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Signup extends GenericServlet{
		@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			String name=req.getParameter("name");
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			String str_Number=req.getParameter("num");
			long number=Long.parseLong(str_Number);
			PrintWriter out=res.getWriter();
			 
			out.println("<html>");
			out.println("<body>");
			//long number=Long.parseLong(req.getParameter("number"));
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/hospital1";
				String userName="root";
				String userPassword="root";
				
				Connection connection=DriverManager.getConnection(url,userName,userPassword);
				PreparedStatement statement=connection.prepareStatement("INSERT INTO staff values(?,?,?,?)");
				statement.setString(1,email);
				statement.setString(2,password);
				statement.setString(3,name);
				statement.setLong(4,number);
				statement.executeUpdate();
				out.println("<h1>Signup successfully</h1>");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			out.println("</body>");
			out.println("</html>");
		
	}


}
