package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.TrainnerStudentDao;
import org.jsp.dto.Student;
import org.jsp.dto.Trainer;

public class TrainerController {
	public static void main(String[] args) {
		
		
		List<Student> students=new ArrayList<>();
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Akhila");
		s1.setEmail("akhila@gmail.com");
		s1.setNumber(7842173056L);
		
		Student s2=new Student();
		s2.setId(2);
		s2.setName("Jayanthi");
		s2.setEmail("jayanthi@gmail.com");
		s2.setNumber(8264276389L);
		
		Student s3=new Student();
		s3.setId(3);
		s3.setName("Rama");
		s3.setEmail("Rama@gmail.com");
		s3.setNumber(98753626783L);
		
		Student s4=new Student();
		s4.setId(4);
		s4.setName("Venkat");
		s4.setEmail("venkat@gmail.com");
		s4.setNumber(7865482891L);
		
		
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		List<Trainer> trainers=new ArrayList<>();
		
		Trainer t1=new Trainer();
		t1.setId(101);
		t1.setName("prem ganesh");
		t1.setSubject("Advance java");
		
		
		Trainer t2=new Trainer();
		t2.setId(102);
		t2.setName("Pavan Kumar");
		t2.setSubject("java Programming");
		
		
		Trainer t3=new Trainer();
		t3.setId(103);
		t3.setName("Satyam");
		t3.setSubject("Web tech");
		
		Trainer t4=new Trainer();
		t4.setId(4);
		t4.setName("Sanjay");
		t4.setSubject("SQL");
		
		trainers.add(t1);
		trainers.add(t2);
		trainers.add(t3);
		trainers.add(t4);
		
		
		Trainer t5=new Trainer();
		t5.setId(105);
		t5.setName("Kowshik");
		t5.setSubject("Java");
		
		Trainer t6=new Trainer();
		t6.setId(106);
		t6.setName("Laxmi");
		t6.setSubject("Data Science");
		
		trainers.add(t5);
		trainers.add(t6);
		
		
		
//		case 1 Students has Trainers and Trianers has Students
//		s1.setTrainers(trainers);
//		s2.setTrainers(trainers);
//		s3.setTrainers(trainers);
//		
//		t1.setStudents(students);
//		t2.setStudents(students);
//		t3.setStudents(students);
//		
//		TrainerStudentDao dao=new TrainerStudentDao();
//		dao.saveStudent(s1);
		
// case 2 Students has Trainers Trainers has No students
		
//		s1.setTrainers(trainers);
//		s2.setTrainers(trainers);
//		s3.setTrainers(trainers);
//		
//		TrainerStudentDao dao=new TrainerStudentDao();
//		dao.saveStudent(s4);
		
// case 3 Trianer has students Student has no trainers
		
//		t1.setStudents(students);
//		t2.setStudents(students);
//		t3.setStudents(students);
//		t4.setStudents(students);
//		
//		TrainnerStudentDao dao=new TrainerStudentDao();
//		dao.saveTrainer(t4);
		
// case 4 Trainer has students Students has trainers
		
		t5.setStudents(students);
		t6.setStudents(students);
		
		
		s1.setTrainers(trainers);
		s2.setTrainers(trainers);
		s3.setTrainers(trainers);
		s4.setTrainers(trainers);
		
		TrainnerStudentDao dao=new TrainnerStudentDao();
		
		dao.saveTrainer(t5);
		
		
		
		
		
		
		
		

		
		
		
		
		

		
		
		
		
		
		
	}

}