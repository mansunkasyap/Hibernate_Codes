package hibernate_crud_operations;
import javax.persistence.*;
@Entity
public class Cricket_players
{
	@Override
	public String toString() {
		return "Cricket_players [pid=" + pid + ", pname=" + pname + ", pmob=" + pmob + ", peid=" + peid + "]";
	}

	@Id
	int pid;
	@Column(nullable=false)
	String pname;
	@Column(nullable=false, unique = true)
	long pmob;
	
	@Column(nullable=false, unique=true)
	String peid;

	public int getPid() {
		return pid;
	}

	public void setId(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public long getPmob() {
		return pmob;
	}

	public void setPmob(long pmob) {
		this.pmob = pmob;
	}

	public String getPeid() {
		return peid;
	}

	public void setPeid(String peid) {
		this.peid = peid;
	}
}
