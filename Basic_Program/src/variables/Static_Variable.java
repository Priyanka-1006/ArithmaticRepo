package variables;

public class Static_Variable {
	static int p = 196;
	static int q = 258;
	
	public static void add() {
		System.out.println("The Value is " + (p+q));
		
		
	}
	public void minus() {
		System.out.println("The value of subtraction is"+ (q-p));
	}
	public static void main(String[] args) {
		add();
		Static_Variable kp = new Static_Variable();
		kp.minus();
		
	}

}
