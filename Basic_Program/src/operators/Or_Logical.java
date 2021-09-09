package operators;

public class Or_Logical {
	int a = 500;
	int b = 400;
	int c = 900;
	public void or() {
		System.out.println(a<b || a>b);// false || true = true
		System.out.println(a>b || a<c);// true || true = true
		System.out.println(b>c || b>a);//false || false = false
		System.out.println(c>a || c<b);// true || false = true
		
		
		System.out.println(a<b | a>b);// false | true =true 
		System.out.println(a>b | a<c);// true | true = true
		System.out.println(b>c | b>a);//false | false = false 
		System.out.println(c>a | c<b);// true | false = true

		
	}
	public static void main(String[] args) {
		Or_Logical d = new Or_Logical();
		d.or();
		
	}

}

