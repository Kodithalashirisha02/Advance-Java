package org.jsp;

public class Charger {
	private int id;
	private String ChargerName;
	private String color;
	
	private double price;
	
	public Charger(int id, String chargerName, String color, double price) {
		super();
		this.id = id;
		ChargerName = chargerName;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Charger [id=" + id + ", ChargerName=" + ChargerName + ", color=" + color + ", price=" + price + "]";
	}
	

}
