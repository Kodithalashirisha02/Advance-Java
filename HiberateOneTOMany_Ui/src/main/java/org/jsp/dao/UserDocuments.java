package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.User;



public class UserDocuments {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("oneToMany_ui");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void saveUser(User user) {
		User user1=entityManager.find(User.class, user.getId());
		if(user1==null) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		System.out.println("saved successfully");
		}
		else {
			throw new RuntimeException("user already exists");
		}
	}
	//saveuser,savedocument,updateuser,updatedocument,remove user,remove document,finduserbyid,finddocumentbyid,removedocumentfroma user,removeuserfromalldocument
	

}
