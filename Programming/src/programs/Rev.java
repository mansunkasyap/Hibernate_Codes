package programs;

public class Rev {
	static long rev(long n) {
		long rev = 0;
		while (n != 0) {
			long rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev;
	}
	static long sod(long n) {
		long sum = 0;
		while(n != 0) {
			sum = sum + n%10;
			n /= 10;
		}
		return sum;
	}
	static long cod(long n) {
		long cnt = 0;
		while(n!=0) {
			cnt++;
			n = n/10;
		}
		return cnt;
	}
	
	
	public static void main(String[] args) {
		long x = 26272829;
		long lastDigit =  x%10;
		long firstDigit = x/(long)Math.pow(10, cod(x)-1);
		long ans1 = rev(x)/lastDigit;
		long ans2 = ans1/firstDigit;
//		System.out.println(ans2);
		while(cod(ans2) != 1) {
			ans2 = sod(ans2);
		}
		System.out.println(sod(x)/ans2);
	}
}
