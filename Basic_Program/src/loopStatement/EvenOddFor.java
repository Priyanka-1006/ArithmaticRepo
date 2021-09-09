package loopStatement;

public class EvenOddFor {
	public void kp() {
		
	    System.out.println("Even Number");
		for(int i = 11; i<=20;i++) {
			if(i % 2 == 0) { 
				System.out.println(i);
				}
			 //System.out.println("Odd Number");

			//{
				//System.out.println("i");
			//}
			
		}
	}
	public static void main(String[] args) {
		EvenOddFor a = new EvenOddFor();
		a.kp();
	}

}
