package hibernate_crud_operations;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
public class ObjectCreation
{
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		System.out.println("Connection Established");
	}
}
