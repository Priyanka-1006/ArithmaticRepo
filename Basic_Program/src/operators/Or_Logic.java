package operators;

public class Or_Logic {
	int a = 1000;
	int b = 500;
	public void or() {
		System.out.println(a>b || b<a);// true || true = true
		System.out.println(a<b || a>b);// false || true =true
		System.out.println(a>b || a<b);// true ||false = true
		System.out.println(a<b || a<b);//false || false =false 
		
		System.out.println(a>b | b<a);// true | true =true 
		System.out.println(a<b | a>b);// false | true =true
		System.out.println(a>b | a<b);// true | false =true 
		System.out.println(a<b | a<b);//false | false = false	
	}
	public static void main(String[] args) {
		Or_Logic c = new Or_Logic();
		c.or();
	}

}
