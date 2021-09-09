package conditionalStatement;

public class PositiveNo {
	public static void positive() {
		int i = 10;
		if(i>0) {
			System.out.println("positive Numeber");
			if(i<20) {
				System.out.println("also a positive number");
				
			
			}
			System.out.println("if not then it consider as a negative no");
			
			
		}
	}
	public void negative() {
		int j = -5;
		if(j<0) {
			if(j>-10) {
				System.out.println("Negative No");
				
			}
			
		}
	}
	public static void main(String[] args) {
		positive();
		PositiveNo z = new PositiveNo();
		z.negative();
	}

}
