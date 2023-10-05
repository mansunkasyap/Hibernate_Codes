package one_to_many_unidirectionalmapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	int uid;
	@Column(nullable=false)
	String uname;
	@Column(nullable=false , unique=true)
	long mob;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(int mob) {
		this.mob = mob;
	}
}
