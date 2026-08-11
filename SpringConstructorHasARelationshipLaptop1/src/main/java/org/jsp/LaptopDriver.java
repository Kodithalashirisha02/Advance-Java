package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {
public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("laptop.xml");
		Laptop b=(Laptop) context.getBean("one");
		System.out.println(b);
	}

}
