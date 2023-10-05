package hibernate_crud_operations;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insertion 
{
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager emgr = emf.createEntityManager();
		EntityTransaction etr = emgr.getTransaction();
		Cricket_players cricket_players = new Cricket_players();
		cricket_players.setId(3);
		cricket_players.setPname("S. Raina");
		cricket_players.setPeid("raina@gmail.com");
		cricket_players.setPmob(800444);
		etr.begin();
		emgr.persist(cricket_players);
		etr.commit();
		System.out.println("Inserted.......");
	}
}