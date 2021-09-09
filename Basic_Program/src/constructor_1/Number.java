package constructor_1;

public class Number {
	int a;
	static int b;
	
	public Number() {
		a=10;
		System.out.println(a);
	}
	public Number(int z) {
		b=20;
	}
	
	public static void main(String[] args) {
		new Number();
		new Number(25);
		System.out.println(b);
	}

}
