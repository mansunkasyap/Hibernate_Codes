package many_one_bidirectionalmapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Facebook {
	@Id
	int aid;
	@Column(nullable=false)
	String aname;
	@OneToMany
	List<FacebookUser>facebookUser;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public List<FacebookUser> getFacebookUser() {
		return facebookUser;
	}
	public void setFacebookUser(List<FacebookUser> facebookUser) {
		this.facebookUser = facebookUser;
	}
}
