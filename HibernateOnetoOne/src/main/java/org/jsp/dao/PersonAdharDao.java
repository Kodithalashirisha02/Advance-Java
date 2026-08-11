package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.AdharCard;
import org.jsp.dto.Person;

public class PersonAdharDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("demo");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void person(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	public void savePerson(Person person) {
		Person person2=entityManager.find(Person.class, person.getId());
		if(person2==null) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		System.out.println("saved successfully");

	}else {
		throw new RuntimeException("person already exists");
	}
	}
	public void updatePerson(Person person) {
		Person person2=entityManager.find(Person.class, person.getId());
		if(person2!=null) {
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
			System.out.println("update successfull");
	}else {
		throw new RuntimeException("person not found");
		}
	}
	public void removePerson(Person person) {
		Person person2=entityManager.find(Person.class, person.getId());
		if(person2!=null) {
			entityTransaction.begin();
			entityManager.remove(person2);
			entityTransaction.commit();
			System.out.println("remove successfull");
		}
		else {
			throw new RuntimeException("person not found");
		}
	}
	public void findPersonById(int id) {
		Person person=entityManager.find(Person.class, id);
		if(person!=null) {
			System.out.println(person);
		}else {
			throw new RuntimeException("person not found");
		}
	}
	public void updateAdharCard(AdharCard card) {
		AdharCard adharCard=entityManager.find(AdharCard.class, card.getNumber());
		if(adharCard!=null) {
			entityTransaction.begin();
			entityManager.merge(card);
			entityTransaction.commit();
			System.out.println("update successfully");
			
		}else {
			throw new RuntimeException("AdharCard not found");
		}
	}
	public void removeAdharCardByPersonData(Person person) {
		Person person2=entityManager.find(Person.class, person.getId());
		if(person2!=null) {
			AdharCard card=person.getCard();
			if(card!=null) {
				person2.setCard(null);
				entityTransaction.begin();
				entityManager.merge(person2);
				entityManager.remove(card);
				entityTransaction.commit();
				System.out.println("remove successfull");
			}else {
				throw new RuntimeException("no adharCard exists");
			}
			
		}
		else {
			throw new RuntimeException("person not found");
		}
	}
	public void addAdharCardToAPerson(int personId,AdharCard card) {
		Person person=entityManager.find(Person.class, personId);
		if(person!=null) {
			AdharCard personCard=person.getCard();
			if(personCard==null) {
				person.setCard(card);
				entityTransaction.begin();
				entityManager.merge(person);
				entityTransaction.commit();
				System.out.println("added successfully");
			}else {
				throw new RuntimeException("Already adhar card exsists");
			}
		}else {
			throw new RuntimeException("person not found");
		}
	}

	
	public void findAdharCard(int id,AdharCard card) {
		Person person=entityManager.find(Person.class, id);
		if(person!=null) {
			AdharCard personCard=person.getCard();
			if(personCard==null) {
				person.setCard(card);
				entityTransaction.begin();
				entityManager.merge(person);
				entityTransaction.commit();
				System.out.println("added successfully");
			}else {
				throw new RuntimeException("Already adhar card exsists");
			}
		}else {
			throw new RuntimeException("person not found");
		}
	}
		
	
	
	
	
	
	
}
