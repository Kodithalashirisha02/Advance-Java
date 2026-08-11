package org.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")

@WebServlet("/login")
public class Login extends HttpServlet{
	
		
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, res);
	
		
	

		//public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			
			String email=req.getParameter("email");
			
	
			String password=req.getParameter("password");
			PrintWriter out=res.getWriter();
			 
			/*out.println("<html>");
			out.println("<body>");*/
			
		
	     try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospital1";
			String userName="root";
			String userPassword="root";
			Connection connection=DriverManager.getConnection(url,userName,userPassword);
			PreparedStatement statement=connection.prepareStatement("select * from staff where email=?");
			statement.setString(1,email);
			ResultSet set=statement.executeQuery();
			if(set.next()) {
				String dbPassword=set.getString("password");
				if(password.equals(dbPassword)) {
					//System.out.println("login success");
					//RequestDispatcher dispatcher=req.getRequestDispatcher("homepage.html");
					//dispatcher.forward(req, res);
					res.sendRedirect("https://www.google.com");
				}
			else {
				//wrong password
				RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
				out.println("<h1>Wrong password</h1>");
				dispatcher.include(req,res);
			}
				
			}	
		else {
				//wrong email
				RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
				out.println("<h1>Wrong email</h1>");
				dispatcher.include(req, res);
			}
			out.print(email);
			out.println(password);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	     
			/*out.println("</html>");
			out.println("</body>");*/
			
		}
		}

