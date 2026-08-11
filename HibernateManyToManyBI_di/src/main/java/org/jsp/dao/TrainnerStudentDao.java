package org.jsp.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Student;
import org.jsp.dto.Trainer;

public class TrainnerStudentDao {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ManyToMany_Bi");
	private EntityManager entityManager=entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveTrainer(Trainer trainer) {
		Trainer t=entityManager.find(Trainer.class, trainer.getId());
		if(t==null) {
			entityTransaction.begin();
			entityManager.merge(trainer);
			entityTransaction.commit();
			System.out.println("Trainer saved successfully");
		}
		else throw new RuntimeException("Trainer alreday exists");
		
		
	}
	public void saveStudent(Student student) {
		Student s=entityManager.find(Student.class, student.getId());
		if(s==null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
			System.out.println("Student saved successfully");
			
		} else throw new RuntimeException("Student already exists");
		
		
	}
	
	public void updateTrainer(int id, String name, String subject) {
	    Trainer t = entityManager.find(Trainer.class, id);

	    if (t != null) {
	        entityTransaction.begin();

	        t.setName(name);
	        t.setSubject(subject);

	        entityTransaction.commit();
	        System.out.println("Trainer updated successfully");
	    } 
	    else throw new RuntimeException("Trainer not found");
	}
	
	public void updateStudent(int id, String name, String email) {
	    Student s = entityManager.find(Student.class, id);

	    if (s != null) {
	        entityTransaction.begin();

	        s.setName(name);
	        s.setEmail(email);

	        entityTransaction.commit();
	        System.out.println("Student updated successfully");
	    } 
	    else throw new RuntimeException("Student not found");
	}
	
	public void findTrainer(int id) {
		Trainer t=entityManager.find(Trainer.class,id);
		if(t!=null)
			System.out.println(t);
		else
			throw new RuntimeException("Trainer not found");
	}
	
	
	public void findStudent(int id) {
		Student s=entityManager.find(Student.class, id);
		if(s!=null)
			System.out.println(s);
		else throw new RuntimeException("Student not found");
	}
	
	public void removeTrainer(int id) {
		Trainer t=entityManager.find(Trainer.class,id);
		if(t!=null) {
			entityTransaction.begin();
			t.getStudents().clear(); //clear() removes all students from trainer.
			entityManager.remove(t);
			entityTransaction.commit();
			System.out.println("Trainer removed successfully");
		} else throw new RuntimeException("Trainer not found");
	}
	
	public void removeStudent(int id) {
	    Student s = entityManager.find(Student.class, id);

	    if (s != null) {
	        entityTransaction.begin();
	        List<Trainer> trainers = entityManager
	                .createQuery("select t from Trainer t", Trainer.class)
	                .getResultList();

	        
	        for (Trainer t : trainers) {
	            if (t.getStudents().contains(s)) {
	                t.getStudents().remove(s);
	            }
	        }
	        entityManager.remove(s);

	        entityTransaction.commit();
	        System.out.println("Student removed successfully");
	    } 
	    else throw new RuntimeException("Student not found");
	}
	public void addStudentToTrainer(int trainerId, int studentId) {
	    Trainer t = entityManager.find(Trainer.class, trainerId);
	    Student s = entityManager.find(Student.class, studentId);

	    if (t != null && s != null) {
	        entityTransaction.begin();

	        t.getStudents().add(s);

	        entityTransaction.commit();
	        System.out.println("Student added to Trainer");
	    }
	}
	
	public void removeStudentFromTrainer(int trainerId, int studentId) {

	    Trainer t = entityManager.find(Trainer.class, trainerId);
	    Student s = entityManager.find(Student.class, studentId);

	    if (t == null || s == null) {
	        throw new RuntimeException("Trainer or Student not found");
	    }

	    entityTransaction.begin();

	    // Remove relation from owning side
	    t.getStudents().remove(s);

	    entityTransaction.commit();

	    System.out.println("Student removed from Trainer successfully");
	}

}