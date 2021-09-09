package scannerClass;

import java.util.Scanner;

public class Multiplication {
	public void kp() {
		int x;
		int y;
		int z;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the first number");
		x = a.nextInt();
		System.out.println("Enter the second number");
		y = a.nextInt();
		a.close();
		z = x * y ;
		System.out.println("The value is " + z);
		
		
		
		
	}
	public static void main(String[] args) {
		Multiplication c = new Multiplication();
		c.kp();
	}

}
