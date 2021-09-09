package naturalNumber;

import java.util.Scanner;

public class Factorial {
	public void pp() {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the number");
	

	int n = s.nextInt();
	int fact = 1;
	for(int i=1;n>=i;i++) {// 5!=5*4*3*2*1
		
		 fact= fact * 1;//increment 
		
	}
	//System.out.println(d);
	System.out.println(fact);
	
	
		

}
	public static void main(String[] args) {
		Factorial k = new Factorial();
		k.pp();
	}
	
}
