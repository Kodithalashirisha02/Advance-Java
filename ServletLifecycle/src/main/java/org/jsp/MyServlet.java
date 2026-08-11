package org.jsp;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//@WebServlet(urlPatterns="/demo",loadOnStartup=1)
public class MyServlet extends GenericServlet{
	public MyServlet() {
		System.out.println("instanstation");
	}

	public void init() throws ServletException{
		System.out.println("Initialisation");
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy...");
	}
	
	
	
	

}

	
