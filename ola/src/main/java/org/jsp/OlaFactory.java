package org.jsp;

public class OlaFactory {
	public static Ola bookOla(String type) {
		switch(type) {
		case "car":
			return new Car();
		case "bus":
			return new Bus();
		case "auto":
			return new Auto();
			
		}
		throw new RuntimeException("unable to book Ola");
	}

}
