package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AcDriver {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("ac.xml");
		Ac b=(Ac) context.getBean("one");
		System.out.println(b);
		
	
}
}
