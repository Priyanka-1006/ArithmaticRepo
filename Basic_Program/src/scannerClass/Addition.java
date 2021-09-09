package scannerClass;

import java.util.Scanner;

public class Addition {
public void add() {
	int a;
	int b;
	

	
 
	 Scanner r = new Scanner(System.in);
	 System.out.println("Enter the the first value");
	a= r.nextInt();
	 System.out.println("Enter the second number");
	 
	 
     b = r.nextInt();

 r.close();
 
 System.out.println("The addition is: " +(a+b));
 
}
public static void main(String[] args) {
	Addition z = new Addition();
	z.add();
}
}
