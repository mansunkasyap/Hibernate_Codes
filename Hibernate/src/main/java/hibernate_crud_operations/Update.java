package hibernate_crud_operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update
{
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager emgr= emf.createEntityManager();
		EntityTransaction etr = emgr.getTransaction();
		//Update Operation 
		Cricket_players cricket_players = new Cricket_players();
		cricket_players.setId(2);
		cricket_players.setPname("S Raina");
		cricket_players.setPeid("sraina@gmail.com");
		cricket_players.setPmob(8080404);
		etr.begin();
		emgr.merge(cricket_players);//if i want to update any data i should use method merge();
		etr.commit();
		System.out.println("Updated Successfully.....");
	}
}
