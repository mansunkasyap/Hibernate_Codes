package inheritance;

class A {
	static int x = 12;
	int y = 200;

	void first() {
		System.out.println("First function");
		System.out.println("Address of A: " + this);
	}

	void second() {
		System.out.println("Second function");
	}
}

class B extends A {
	  void first() {
		System.out.println("Address of B: "+ this);
	}
	 void second() {
		 System.out.println("B-->Second");
		 System.out.println(this);
	 }
}

public class Task1 {
	public static void main(String[] args) {
		A b = new A();
		b.first();
		b.second();
		System.out.println("\n\n");
		
		A up = new B();
		System.out.println(up.y);
		up.first();
		up.second();
		System.out.println("\n\n");
		
		 A xa = (A)up;
		 xa.first();
	}
}
