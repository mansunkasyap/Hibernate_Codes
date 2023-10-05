package many_to_many_unidirectional;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teams {
	@Id
	int tid;
	
	@Column(nullable=false, unique=true)
	String tname;
	
	@ManyToMany
	List<Stadiums>list;

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

	public List<Stadiums> getList() {
		return list;
	}

	public void setList(List<Stadiums> list) {
		this.list = list;
	}
	
}
