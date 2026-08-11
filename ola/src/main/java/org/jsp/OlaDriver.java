package org.jsp;

public class OlaDriver {
	public static void main(String[] args) {
		//Ola ola=OlaFactory.bookOla("aeroplane");
		Ola ola=OlaFactory.bookOla("car");
		ola.greet();
	}

}
