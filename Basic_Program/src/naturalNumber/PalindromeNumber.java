package naturalNumber;

import java.util.Scanner;

public class PalindromeNumber {
	public void pp() {
		int n;
		Scanner z = new Scanner(System.in);
		System.out.println("Enter the number");
	    n = z.nextInt();
	
		 
	    int k = n;
		
		int b = 0;
		int c;
		while(n > 0) {
			c = n %10;   //525=525%10=5(c)      0*10+5=5 (b)        525/10=52(n)
			b = b*10 + c;//52%10=2(c)          5*10+2=52(b)         52/10=5(n)
            n = n/10;     //5%10=5         52*10+2= 525       0/10=0
		}
		
	
			if( k == b) {
				System.out.println("Palidrome Number");
			}
				else {
					System.out.println("Not Palindrome Number");
				}
				
			}
			
			
			
		
	
	public static void main(String[] args) {
		PalindromeNumber e = new PalindromeNumber();
		e.pp();
	}

}
