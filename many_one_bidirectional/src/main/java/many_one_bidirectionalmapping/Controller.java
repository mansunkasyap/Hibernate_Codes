package many_one_bidirectionalmapping;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager emgr = emf.createEntityManager();
		EntityTransaction etr = emgr.getTransaction();
		
		FacebookUser user1 = new  FacebookUser();
		user1.setUid(1);
		user1.setUname("Alia_Kapoor");
		
		FacebookUser user2 = new FacebookUser();
		user2.setUid(2);
		user2.setUname("Lappu_Sa");
		
		ArrayList<FacebookUser>list = new ArrayList<FacebookUser>();
		list.add(user1);
		list.add(user2);
		
		Facebook facebook = new Facebook();
		facebook.setAid(111);
		facebook.setAname("Facebook");
		facebook.setFacebookUser(list);
		
		etr.begin();
		emgr.persist(user1);
		emgr.persist(user2);
		emgr.persist(facebook);
		etr.commit();
		System.out.println("We Successfully executed ");
	}
}