package org.jsp;

public class Ac {
	private int id;
	private String acName;
	private int rating;
	private double price;
	private Remote remote;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAcName() {
		return acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Remote getRemote() {
		return remote;
	}
	public void setRemote(Remote remote) {
		this.remote = remote;
	}
	@Override
	public String toString() {
		return "Ac [id=" + id + ", acName=" + acName + ", rating=" + rating + ", price=" + price + ", remote=" + remote
				+ "]";
	}
	
	

}
