package hibernate.practice;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Establish_Conn
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		System.out.println("...Connection Established...");
	}
}
