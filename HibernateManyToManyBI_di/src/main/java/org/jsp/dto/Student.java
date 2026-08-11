package org.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String email;
	private long number;
	
	
	@ManyToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
	
	private List<Trainer> trainers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	
	public List<Trainer> getTrainers() {
		return trainers;
	}
	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + "]";
	}
	
	
	

}
