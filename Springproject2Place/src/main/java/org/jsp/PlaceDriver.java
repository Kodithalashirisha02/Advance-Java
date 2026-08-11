package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlaceDriver {
	

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("place.xml");
		Place place=context.getBean(Place.class);
		place.start();
		System.out.println(place);
		place.stop();
	}

}
