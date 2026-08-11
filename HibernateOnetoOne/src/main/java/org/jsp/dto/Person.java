package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	private AdharCard card;
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
	public AdharCard getCard() {
		return card;
	}
	public void setCard(AdharCard card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", card=" + card + "]";
	}
	public static void setname(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
