package many_many_bidirectional;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class FootballStadiums {
	@Id
	int sid;
	
	@Column(nullable=false, unique = true)
	String sname;
	
	@ManyToMany
	List<FootballTeam> teamList;

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

	public List<FootballTeam> getTeamList() {
		return teamList;
	}

	public void setTeamList(List<FootballTeam> teamList) {
		this.teamList = teamList;
	}
}
