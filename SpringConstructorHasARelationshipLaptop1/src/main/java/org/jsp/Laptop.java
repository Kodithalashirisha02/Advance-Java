package org.jsp;

public class Laptop {
	private int id;
	private String laptopName;
	private int ram;
	private double price;
	private Charger charger;
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", laptopName=" + laptopName + ", ram=" + ram + ", price=" + price + ", charger="
				+ charger + "]";
	}
	public Laptop(int id, String laptopName, int ram, double price, Charger charger) {
		super();
		this.id = id;
		this.laptopName = laptopName;
		this.ram = ram;
		this.price = price;
		this.charger = charger;
	}
	
	


}
