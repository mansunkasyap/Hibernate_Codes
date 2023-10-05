package studentException;

public class StudentNotFoundException extends Exception {
	private String msg;

	public StudentNotFoundException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
}
