package many_to_many_unidirectional;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
		Stadiums stadiums1 = new Stadiums();
		stadiums1.setSid(1);
		stadiums1.setSname("Chinnaswamy");
		
		Stadiums stadiums2 = new Stadiums();
		stadiums2.setSid(2);
		stadiums2.setSname("Melbourne");
		
		ArrayList<Stadiums> stadiumsList = new ArrayList<Stadiums>();
		stadiumsList.add(stadiums1);
		stadiumsList.add(stadiums2);
		
		
		Teams team1 = new Teams();
		team1.setTid(11);
		team1.setTname("India");
		team1.setList(stadiumsList);
		
		Teams team2 = new Teams();
		team2.setTid(102);
		team2.setTname("Aus");
		team2.setList(stadiumsList);
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager emgr = emf.createEntityManager();
		EntityTransaction etr = emgr.getTransaction();
		etr.begin();
		emgr.persist(stadiums1);
		emgr.persist(stadiums2);
		emgr.persist(team1);
		emgr.persist(team2);
		etr.commit();
		System.out.println("Many-One Unidirectional....");
	}
}
