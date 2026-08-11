package org.jsp.controller;

import org.jsp.dao.PersonAdharDao;
import org.jsp.dto.AdharCard;
import org.jsp.dto.Person;

public class PersonController {
	public static void main(String[] args) {
		Person person=new Person();
		person.setId(110);
		Person.setname("sirisha");
		
		AdharCard card=new AdharCard();
		card.setNumber(896547123L);
		card.setdob(02-10-2003);
		card.setgender("f");
		card.setaddress("chennai");
		person.setCard(card);
		PersonAdharDao dao=new PersonAdharDao();
		//dao.person(person);
		//dao.savePerson(person);
		//dao.updatePerson(person);
		//dao.removePerson(person);
		dao.addAdharCardToAPerson(110,card);
	}

}
