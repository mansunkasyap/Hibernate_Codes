package programs;

public class Operation2 {
	static int count(int n) {
		int cnt = 0;
		while(n != 0) {
			cnt++;
			n /= 10;
		}
		return cnt;
	}
	static int Static1(int n) {
		int cnt = count(n);
		System.out.println(cnt + " is this");
		return cnt;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Static1(2333));
	}
}
