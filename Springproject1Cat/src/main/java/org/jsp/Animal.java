package org.jsp;

public class Animal {
	private int animalnumber;
	private String animalname;
	private String type;
	private String color;
	private String breed;
	public int getAnimalnumber() {
		return animalnumber;
	}
	public void setAnimalnumber(int animalnumber) {
		this.animalnumber = animalnumber;
	}
	public String getAnimalname() {
		return animalname;
	}
	public void setAnimalname(String animalname) {
		this.animalname = animalname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		return "Animal [animalnumber=" + animalnumber + ", animalname=" + animalname + ", type=" + type + ", color="
				+ color + ", breed=" + breed + "]";
	}
	public void start() {
		// TODO Auto-generated method stub
		
		System.out.println("starting....");
		
	}
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stopping");
		
	}
	
	

}
