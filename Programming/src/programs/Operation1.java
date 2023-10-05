package programs;

class Operation1 {
	static int cod(int n) {
		int cnt = 0;
		while (n != 0) {
			cnt++;
			n = n / 10;
		}
		return cnt;
	}

	static int facto(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	static int sumFib(int n) {
		int a = 0, b = 1, c = a + b, sum = 0;
		if (n == 1) {
			sum = a;
			return sum;
		} else if (n == 2) {
			sum = a + b;
			return sum;
		} else {
			sum = a + b;
			for (int i = 2; i < n; i++) {
				sum = sum + c;
				a = b;
				b = c;
				c = a + b;
			}
		}
		return sum;
	}

	static void checkArmstrong(int n) {
		int cpy = n, sum = 0;
		int cd = cod(cpy);
		System.out.println(cd);
		while (cpy != 0) {
			int rem = cpy % 10;
			int pow = (int) Math.pow(rem, cd);
			sum = sum + pow;
			cpy = cpy / 10;
		}
		if (sum == n) {
			System.out.println("Armstrong no");
		} else {
			System.out.println("Not A Armstrong no.");
		}
	}

	public static void main(String[] args) {
		int sum = sumFib(11);
		int digitSum = (int) (sum%10 + sum/Math.pow(10, cod(sum)-1));
		checkArmstrong(facto(digitSum));
	}
}