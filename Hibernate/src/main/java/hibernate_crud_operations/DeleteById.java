package hibernate_crud_operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager emgr= emf.createEntityManager();
		EntityTransaction  etr= emgr.getTransaction();
		
		 Cricket_players cp = emgr.find(Cricket_players.class, 2);
		 etr.begin();
		 emgr.remove(cp);
		 etr.commit();
		 System.out.println(cp);
	}
}
