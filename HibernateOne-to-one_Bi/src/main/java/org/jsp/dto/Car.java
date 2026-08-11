package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
	private int id;
	private String brandName;
	private double cost;
	@JoinColumn(name="engine")
	@OneToOne(cascade=CascadeType.ALL)
	private Engine engine;
	@Override
	public String toString() {
		return "Car [id=" + id + ", brandName=" + brandName + ", cost=" + cost + ", engine=" + engine + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	

}
