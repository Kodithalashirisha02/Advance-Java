package org.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bottle {
	int id;
	String brandName;
	String color;
	int capacity;
	Cap cap;
	@Override
	public String toString() {
		return "Bottle [id=" + id + ", brandName=" + brandName + ", color=" + color + ", capacity=" + capacity
				+ ", cap=" + cap + "]";
	}
	public Bottle( @Value("1") int id, @Value("wipro")String brandName, @Value("orange")String color,@Value("5000") int capacity,@Autowired Cap cap) {
		
		super();
		this.id = id;
		this.brandName = brandName;
		this.color = color;
		this.capacity = capacity;
		this.cap = cap;
	}
	

}
