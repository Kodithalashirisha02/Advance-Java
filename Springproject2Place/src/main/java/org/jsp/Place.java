package org.jsp;

public class Place {
	private String location;
	private int totaldays;
	private String atmosphere;
	private String travelVechicle;
	@Override
	public String toString() {
		return "Place [location=" + location + ", totaldays=" + totaldays + ", atmosphere=" + atmosphere
				+ ", travelVechicle=" + travelVechicle + "]";
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTotaldays() {
		return totaldays;
	}
	public void setTotaldays(int totaldays) {
		this.totaldays = totaldays;
	}
	public String getAtmosphere() {
		return atmosphere;
	}
	public void setAtmosphere(String atmosphere) {
		this.atmosphere = atmosphere;
	}
	public String getTravelVechicle() {
		return travelVechicle;
	}
	public void setTravelVechicle(String travelVechicle) {
		this.travelVechicle = travelVechicle;
	}
	public void start() {
		// TODO Auto-generated method stub
		
	}
	
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
	

}
