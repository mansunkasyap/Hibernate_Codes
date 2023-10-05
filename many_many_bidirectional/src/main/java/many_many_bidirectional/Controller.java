package many_many_bidirectional;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Controller {
	public static void main(String[] args) {
		
		FootballTeam team1 = new FootballTeam();
		team1.setTid(1);
		team1.setTname("Argentina");
		
		
		FootballTeam team2 = new FootballTeam();
		team2.setTid(11);
		team2.setTname("ABC");
		
		
		FootballStadiums stadiums1 = new FootballStadiums();
		stadiums1.setSid(1111);
		stadiums1.setSname("Wallah Habibi");
		
		FootballStadiums stadiums2 = new FootballStadiums();
		stadiums2.setSid(1122);
		stadiums2.setSname("Wallah");
		
		ArrayList<FootballStadiums> fbs = new ArrayList<FootballStadiums>();
		fbs.add(stadiums1);
		fbs.add(stadiums2);
		
		ArrayList<FootballTeam> fbt = new ArrayList<FootballTeam>();
		fbt.add(team1);
		fbt.add(team2);
		
		team1.setStadiumList(fbs);
		team2.setStadiumList(fbs);
		
		stadiums1.setTeamList(fbt);
		stadiums2.setTeamList(fbt);
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager emgr = emf.createEntityManager();
		EntityTransaction etr = emgr.getTransaction();
		etr.begin();
		emgr.persist(stadiums1);
		emgr.persist(stadiums2);
		emgr.persist(team1);
		emgr.persist(team2);
		etr.commit();
		System.out.println("Many-Many Bidirectional....");
	}
}
