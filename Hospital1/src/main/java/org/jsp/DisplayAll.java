package org.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Set;

public class DisplayAll extends GenericServlet{
	

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table>");
		
		
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospital1";
			String userName="root";
			String userPassword="root";
			Connection connection=DriverManager.getConnection(url,userName,userPassword);
			Statement statement=connection.createStatement();
			String query="select * from staff";
			ResultSet set=statement.executeQuery(query);
			out.println("<h4>All staff Members</h4>");
			out.println("<br>");
			out.println("<table border cellspacing=\"0\" cellpadding=\"10\">");
			out.println("<tr>");
			out.println("<td>");
			out.println("Name");
			out.println("</td>");
			out.println("<td>");
			out.println("email");
			out.println("</td>");
			out.println("<td>");
			out.println("password");
			out.println("</td>");
			
			out.println("<td>");
			out.println("number");
			out.println("</td>");
			out.println("<td>");
			out.println("operations");
			out.println("</td>");
			out.println("</tr>");
			
			while(set.next()) {
				String name1=set.getString("name"); 
				String email1=set.getString("email");
				String password1=set.getString("password");
				long number1=set.getLong("number");
				out.println("<tr>");
				out.println("<td>");
				out.println("omsha");
				out.println("</td>");
				out.println("<td>");
				out.println("omsha@gmail.com");
				out.println("</td>");
				out.println("<td>");

				out.println("omsha123");
				out.println("</td>");
				out.println("<td>");
				out.println("20020920");
				out.println("</td>");
				out.println("<td>");
				out.println("<button>update</button> &nbsp <button>delete</button>");
				out.println("</td>");
				
				out.println("</tr>");
			}
			out.println("</table>");

			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		out.println("</html>");
		out.println("</body>");
	}
	
	

}
