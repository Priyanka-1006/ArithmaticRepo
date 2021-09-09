package operators;

public class Negation_Unary {
	public void one() {
	boolean b = true;
	boolean c = false;
	System.out.println(!b);//false
	System.out.println(!c);//true
		
	}
	public void two() {
		int z = 5;
		int x = -7;
		System.out.println(~z);//(-variable-1)=value of ~z -(5)-1=-6
		System.out.println(~x);//-(-7)-1=6
		
	}
	public void three() {
		int j = 10;
		System.out.println(+j);//10
		System.out.println(-j);//-10
	}
public static void main(String[] args) {
	Negation_Unary a = new Negation_Unary();
	a.one();
	a.two();
	a.three();
}
	

}
