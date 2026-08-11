package org.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdharCard {
	@Id
	private long number;
	private int dob;
	private char gender;
	public long getNumber() {
		return number;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "AdharCard [number=" + number + ", dob=" + dob + ", gender=" + gender + "]";
	}
	public void setdob(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setgender(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setaddress(String string) {
		// TODO Auto-generated method stub
		
	}
	
}
