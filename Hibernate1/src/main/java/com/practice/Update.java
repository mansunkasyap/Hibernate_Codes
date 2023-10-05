package com.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager emgr = emf.createEntityManager();
		EntityTransaction etr = emgr.getTransaction();
		Student_Data std = new Student_Data();
		std.setSid(1);
		std.setMarks(90);
		std.setSname("Rishi");
		etr.begin();
		emgr.merge(std);
		etr.commit();
		System.out.println("Updatedd...");
	}
}
