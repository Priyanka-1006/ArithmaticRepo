package naturalNumber;

import java.util.Scanner;

public class While {
	public void pp() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Natural  Number");
		int n = s.nextInt();
		s.close();
	
	
		int i ;
		for(i = 1;i <=n;i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		While a = new While();
		a.pp();
		
	}

}
