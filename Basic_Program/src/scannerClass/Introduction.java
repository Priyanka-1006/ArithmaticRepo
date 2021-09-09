package scannerClass;

import java.util.Scanner;

public class Introduction {
	public void mySelf() {
	
		
		System.out.println("Enter your details");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
	    String name = sc.nextLine();

        System.out.println("Enter your address");
	    String address = sc.nextLine();
	    
	    System.out.println("Status");
	    String status  = sc.nextLine();
	    
	    
	    System.out.println("Enter your date of birth");
	    String birthdate = sc.nextLine();
	    
	    System.out.println("Enter your Bachlor Degree");
	    String bd = sc.nextLine();
	    
	    System.out.println("Enter Blood group");
	    String bg = sc.nextLine();
	    
	    System.out.println("Enter your hobbies");
	    String ho = sc.nextLine();
	    
	    System.out.println("Hi My name is " + name);
	    
	    System.out.println("I belongs to " +address);
	    
	    System.out.println("I am " +status);
	    
	    System.out.println("My date of birth is" + birthdate);
	    
	    System.out.println("I did my graduation in "+ bd);
	    
	    System.out.println("My blood group is "+ bg);
	    
	    System.out.println("My hobbies are"+ ho);
	    
	    
	    
	    
	    
	    sc.close();
	    
	
	    
		}
	public static void main(String[] args) {
		Introduction me = new Introduction();
		me.mySelf();
		
		
		
	}

}
