package oneToone_bidirectionalmapping;
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
		
		Scanner scanner = new Scanner(System.in);
		
		//Student section
		Student student = new Student();
		System.out.println("Enter Student ID: ");
		int sid = scanner.nextInt();
		System.out.println("Enter Student name: ");
		String sname = scanner.next();
		student.setSid(sid);
		student.setSname(sname);
		
		//Teacher section
		Teacher teacher = new Teacher();
		System.out.println("Enter teacher ID: ");
		int tid = scanner.nextInt();
		System.out.println("Enter teacher Name: ");
		String tname = scanner.next();
		teacher.setTid(tid);
		teacher.setTname(tname);
		
		student.setTeacher(teacher);
		teacher.setStudent(student);
		
		etr.begin();
		emgr.persist(student);
		emgr.persist(teacher);
		etr.commit();
		System.out.println("OneToOne Bi-Directional mapping done");
	}
}