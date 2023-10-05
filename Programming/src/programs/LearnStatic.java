package programs;

class A{
	static int x;
	int y = 30;
	A(){
		x = 40;
	}
	int show() {
		return x;
	}
}

class B extends A{
	static int x = 30;
	int y = 40;
	@Override
	int show() {
		return y;
	}
}

public class LearnStatic {
	public static void main(String[] args) {
		A a = new B();
		System.out.println("x: "+a.x);
		System.out.println("y: "+ a.show());
	}
}
