package hibernate_crud_operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchById 
{ 
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager emgr = emf.createEntityManager();
//		EntityTransaction etr = emgr.getTransaction(); we r not suppose to use this method b/c it'll not affect my db;
		Cricket_players cricket_player = emgr.find(Cricket_players.class, 1);
		System.out.println(cricket_player.getPid()+" "+cricket_player.getPname()+" "+cricket_player.getPeid()+" "+ cricket_player.getPmob());
	}
}
