package operators;

public class Logical_And {
	int a = 500;
	int b = 400;
	int c = 900;
	public void and() {
		System.out.println(a<b && a>b);// false && true = false
		System.out.println(a>b && a<c);// true && true =true
		System.out.println(b>c && b>a);//false && false = false
		System.out.println(c>a && c<b);// true && false = false
		
		
		System.out.println(a<b & a>b);// false & true = false
		System.out.println(a>b & a<c);// true & true =true
		System.out.println(b>c & b>a);//false & false =false 
		System.out.println(c>a & c<b);// true & false =false 

		
	}
	public static void main(String[] args) {
		Logical_And d = new Logical_And();
		d.and();
		
	}

}
