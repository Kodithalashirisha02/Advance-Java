package org.jsp;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class AnimalDriver {
      public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("animal.xml");
		Animal animal=context.getBean(Animal.class);
		animal.start();
		System.out.println(animal);
		animal.stop();
		
	}
}    

