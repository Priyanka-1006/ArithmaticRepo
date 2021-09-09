package operators;

public class And_Logic {
	int a = 1000;
	int b = 500;
	public void add() {
		System.out.println(a>b && b<a);// true && true = true
		System.out.println(a<b && a>b);// false && true =false
		System.out.println(a>b && a<b);// true && false = false
		System.out.println(a<b && a<b);//false && false = false
		
		System.out.println(a>b & b<a);// true && true = true
		System.out.println(a<b & a>b);// false && true =false
		System.out.println(a>b & a<b);// true && false = false
		System.out.println(a<b & a<b);//false && false =false 	
	}
	public static void main(String[] args) {
		And_Logic c = new And_Logic();
		c.add();
	}

}
