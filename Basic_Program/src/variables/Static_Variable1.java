package variables;

public class Static_Variable1 {
	static boolean b = true;
	static int a =500;
	static int c = 2;
	public static void division() {
		System.out.println(a / c);
		System.out.println(b);
		
	}
	public void num() {
		System.out.println("check the condition " + (a < c));
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		division();
		
	Static_Variable1 sr = new Static_Variable1();
	sr.num();
	}
	
			

}
