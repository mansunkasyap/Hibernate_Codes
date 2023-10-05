package hibernate_crud_operations;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll
{
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager emgr = emf.createEntityManager();
		Query query = emgr.createQuery("select x from Cricket_players x");// JPQL Query-> JAVA PERSISTENCE QUERY LANG
		List<Cricket_players>plist = query.getResultList();
		for(Cricket_players cp : plist)
		{
			System.out.println(cp.getPid()+" "+cp.getPname());
		}
	}
}
