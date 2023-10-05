package hibernate.practice;

import javax.persistence.*;

@Entity
public class Students_Data {
	@Id
	int sid;
	@Column(nullable = false)
	String name;
	@Column(nullable = false, unique=true)
	int Total_marks;

}
