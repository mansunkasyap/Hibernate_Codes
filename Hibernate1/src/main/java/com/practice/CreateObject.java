package com.practice;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateObject {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		System.out.println("Connection Established.....");
	}
}
