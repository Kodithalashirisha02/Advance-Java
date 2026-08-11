package org.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cap {
	private int id;
	private int size;
	private String color;
	private String shape;
	@Override
	public String toString() {
		return "Cap [id=" + id + ", size=" + size + ", color=" + color + ", shape=" + shape + "]";
	}
	public int getId() {
		return id;
	}
	@Value("1")
	public void setId(int id) {
		this.id = id;
	}
	public int getSize() {
		return size;
	}
	@Value("200")
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	@Value("red")
	public void setColor(String color) {
		this.color = color;
	}
	public String getShape() {
		return shape;
	}
	@Value("circle")
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	

}
