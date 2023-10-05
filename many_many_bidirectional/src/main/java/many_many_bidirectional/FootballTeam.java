package many_many_bidirectional;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class FootballTeam {
	@Id
	int tid;
	
	@Column(nullable=false, unique=true)
	String tname;
	
	@ManyToMany
	List<FootballStadiums>stadiumList;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public List<FootballStadiums> getStadiumList() {
		return stadiumList;
	}

	public void setStadiumList(List<FootballStadiums> stadiumList) {
		this.stadiumList = stadiumList;
	}
}
