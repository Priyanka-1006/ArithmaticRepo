package methodCalling;

public class Area {
	public static void areaofsquare(int a) {
		int d = a*a;
		System.out.println(d);
		
	}
	public void area(long j) {
		long z = j*j;
		System.out.println(z);
		
		
	}
	public void area(long t,int c) {
		long e = t*c;
		System.out.println(e);
		
	}
	public void reactangle(int x,int z) {
		int m = x*z;
		System.out.println(m);
		
	}
public static void main(String[] args) {
	areaofsquare(10);
	Area s = new Area();
	s.area(50);
	s.reactangle(12,15);
	s.area(54,5);
	
}
}
