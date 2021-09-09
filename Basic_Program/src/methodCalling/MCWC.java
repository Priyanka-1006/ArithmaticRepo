package methodCalling;

public class MCWC {
	public static void aj() {
		System.out.println("Pranav  is Builder");
		
		}
	public void dj() {
		System.out.println("Find Yourself with nature");
		
	}
	public static void main(String[] args) {
		aj();//method call in class or single class.
		MCWC s = new MCWC();
		s.dj();
		MCOC a = new MCOC();// method call from other class
		a.dp();
		MCOC.kj();
		
	

		
	}

}
