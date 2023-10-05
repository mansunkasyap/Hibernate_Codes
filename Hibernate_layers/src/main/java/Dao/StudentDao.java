package Dao;

import java.util.List;
import studentException.StudentNotFoundException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.StudentDto;

public class StudentDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager emgr = emf.createEntityManager();
	EntityTransaction etr = emgr.getTransaction();

	public void insert(StudentDto dto) {
		etr.begin();
		emgr.persist(dto);
		etr.commit();
	}

	public void readById(int id) throws StudentNotFoundException {
		if (emgr.find(StudentDto.class, id) != null) {
			StudentDto dto = emgr.find(StudentDto.class, id);
			System.out.println(dto);
		} else {
			throw new StudentNotFoundException("StudentNotFoundException");
		}
	}

	public void readAll() throws InterruptedException {
		StudentDto dto = new StudentDto();
		Query query = emgr.createQuery("select x from StudentDto x");
		List<StudentDto> list = query.getResultList();
		for (StudentDto st : list) {
			Thread.sleep(1000);
			System.out.println(st.getSid() + " " + st.getSname() + " " + st.getMob() + "\n");
		}
	}

	public void update(StudentDto set) {
		etr.begin();
		emgr.merge(set);
		etr.commit();
		System.out.println("Updated .......");
	}

	public void deleteById(int id) {
		StudentDto dto = emgr.find(StudentDto.class, id);
		etr.begin();
		emgr.remove(dto);
		etr.commit();
		System.out.println("Deleted......");
	}

	public void deleteAll() {
		Query qry = emgr.createQuery("delete from studentdto");
		etr.begin();
		qry.executeUpdate();
		etr.commit();
	}

}