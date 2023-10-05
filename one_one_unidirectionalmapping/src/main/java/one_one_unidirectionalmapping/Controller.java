package one_one_unidirectionalmapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.*;

public class Controller {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager emgr = emf.createEntityManager();
		EntityTransaction etr = emgr.getTransaction();
		
		Teacher teacher = new Teacher();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Teacher id: ");
		int tid = sc.nextInt();
		System.out.println("Enter the teacher name: ");
		String tname = sc.next();
		teacher.setTid(tid);
		teacher.setTname(tname);
		Student student = new Student();
		System.out.println("Enter Student id: ");
		int sid = sc.nextInt();
		System.out.println("Enter Student name: ");
		String sname = sc.next();
		student.setSid(sid);
		student.setSname(sname);
		
		student.setTeacher(teacher);// in this line successfully we taken teacher info inside student table
		etr.begin();
		emgr.persist(teacher);
		emgr.persist(student);
		etr.commit();
		System.out.println("One to One uni-directional mapping has been establish Successfully");
	}
}
