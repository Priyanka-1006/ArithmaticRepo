package primeNumber;

import java.util.Scanner;

public class PrimeNo {// int n ;  7 % 1==0 and 7 % 7==0 
	public void number() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		
		       if(a % a  == 0 ) {
		if(a%2==0)
		
				System.out.println("Its Prime Number");
				}
			else {
				System.out.println("Its  not Prime Number");
			
		}
		}
	
			
	
		
		
	
	public static void main(String[] args) {
		PrimeNo z = new PrimeNo();
		z.number();
	

	
	

	}

}
