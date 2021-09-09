package variables;

public class Instance_Variable {
	int a = 120;
	int b = 140;
	  
	public void add() {
		System.out.println("The addition of the two number is " + (a+b));
	}
	public void minus() {
		System.out.println("the subtraction of two number is" + (a-b));
	}
	public static void main(String[] args) {
		Instance_Variable add1 = new Instance_Variable();
		add1.add();
		add1.minus();
	}

}
