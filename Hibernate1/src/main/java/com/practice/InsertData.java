package com.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager emgr = emf.createEntityManager();
		EntityTransaction etr = emgr.getTransaction();
		Student_Data std = new Student_Data();
		std.setSid(2);
		std.setSname("S R S");
		std.setMarks(80);
		etr.begin();
		emgr.persist(std);
		etr.commit();
		System.out.println("Donnneee....");
	}
}
