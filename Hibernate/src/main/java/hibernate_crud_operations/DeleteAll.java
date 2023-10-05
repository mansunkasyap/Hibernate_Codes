package hibernate_crud_operations;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteAll {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager emgr = emf.createEntityManager();
		EntityTransaction etr = emgr.getTransaction();
		Query query = emgr.createQuery("delete from Cricket_players");
		etr.begin();
		query.executeUpdate();
		etr.commit(); 
		System.out.println("Updated.... ");
	}
}
