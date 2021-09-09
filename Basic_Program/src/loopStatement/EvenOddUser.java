package loopStatement;

import java.util.Scanner;

public class EvenOddUser {
	public void kp() {
		int n;
		
		System.out.println("Enter the number");
		Scanner t = new Scanner(System.in);
		n = t.nextInt(); 
		System.out.println("The Number is "+ n);
		if(n % 2 == 0) {
			System.out.println("The Number is Even Number");
		}
			else {
				System.out.println("The Number is Odd Number");
			}
			
		}
	public static void main(String[] args) {
		EvenOddUser z = new EvenOddUser();
		z.kp();
		
	}

}
