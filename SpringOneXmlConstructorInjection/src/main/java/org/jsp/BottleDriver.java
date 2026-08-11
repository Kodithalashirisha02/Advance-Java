package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BottleDriver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bottle.xml");
          Bottle bottle=context.getBean(Bottle.class);
		  System.out.println(bottle);
	}


}
