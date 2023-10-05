package com.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager emgr = emf.createEntityManager();
		Student_Data student1 = emgr.find(Student_Data.class, 1);
		System.out.println("[ " + student1.getSid()+ ", "+ student1.getSname()+", "+ student1.getMarks()+" ]");
	}
}
