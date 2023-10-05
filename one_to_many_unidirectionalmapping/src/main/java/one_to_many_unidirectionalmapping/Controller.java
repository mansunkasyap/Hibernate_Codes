package one_to_many_unidirectionalmapping;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager emgr = emf.createEntityManager();
		EntityTransaction etr = emgr.getTransaction();
		
		User user1 = new User();
		user1.setUid(11);
		user1.setUname("User1_1");
		user1.setMob(9883738);
		
		User user2 = new User();
		user2.setUid(22);
		user2.setUname("User2_2");
		user2.setMob(98837398);
		
		User user3 = new User();
		user3.setUid(1100);
		user3.setUname("User3_3");
		user3.setMob(9883638);
		
		Provider provider = new Provider();
		provider.setPid(100);
		provider.setPname("Police");
		
		List<User> userlist = new ArrayList();
		userlist.add(user1);
		userlist.add(user2);
		userlist.add(user3);
		
		provider.setUserlist(userlist);//Sara user ka data provider k pass aa gya
		
		etr.begin();
		emgr.persist(user1);
		emgr.persist(user2);
		emgr.persist(user3);
		emgr.persist(provider);
		etr.commit();
		System.out.println("One to Many Achived Succesfully");
	}
}
