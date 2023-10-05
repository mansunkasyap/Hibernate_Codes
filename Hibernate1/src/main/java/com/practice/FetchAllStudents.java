package com.practice;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllStudents {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager emgr = emf.createEntityManager();
		Query query = emgr.createQuery("select x from Student_Data x");
		List<Student_Data> students = query.getResultList();
		for(Student_Data a: students)
		{
			System.out.println(a.getSid()+" "+ a.getSname() + " "+a.getMarks());
		}
	}
}