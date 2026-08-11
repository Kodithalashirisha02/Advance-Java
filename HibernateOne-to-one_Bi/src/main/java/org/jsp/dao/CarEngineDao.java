package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Car;
import org.jsp.dto.Engine;







public class CarEngineDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("one_to_one");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void car(Car car) {
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
	}
	
	
	public void saveEngine(Engine engine) {
		Engine engine2=entityManager.find(Engine.class,engine.getId());
		if(engine2==null) {
		entityTransaction.begin();
		entityManager.persist(engine);
		entityTransaction.commit();
		System.out.println("saved successfully");

	}else {
		throw new RuntimeException("engine already exists");
	}
	}
	
	
	public void updateEngine(Engine engine) {
		Engine engine2=entityManager.find(Engine.class, engine.getId());
		if(engine!=null) {
			entityTransaction.begin();
			entityManager.merge(engine);
			entityTransaction.commit();
			System.out.println("update successfull");
	}else {
		throw new RuntimeException("engine not found");
		}
	}
	
	public void removeEngine(Engine engine) {
		Engine engine2=entityManager.find(Engine.class, engine.getId());
		if(engine2!=null) {
			entityTransaction.begin();
			entityManager.remove(engine2);
			entityTransaction.commit();
			System.out.println("remove successfull");
		}
		else {
			throw new RuntimeException("engine not found");
		}
	}
	
	public void findEngineById(int id) {
		Engine engine=entityManager.find(Engine.class, id);
		if(engine!=null) {
			System.out.println(engine);
		}else {
			throw new RuntimeException("engine not found");
		}
	}


	public void saveCar(Car car) {
		// TODO Auto-generated method stub
		Car car2=entityManager.find(Car.class,car.getId());
		if(car2==null) {
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		System.out.println("saved successfully");

	}else {
		throw new RuntimeException("car already exists");
	}
	}
	
	
	public void findCarById(int id) {
		Car car=entityManager.find(Car.class, id);
		if(car!=null) {
			System.out.println(car);
		}else {
			throw new RuntimeException("engine not found");
		}
	}

		
		
	}


	



