package oneToone_bidirectionalmapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student{
	@Id
	int sid;
	@Column(nullable=false)
	String sname;
	@OneToOne
	Teacher teacher;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher t1) {
		this.teacher = t1;
	}
}
