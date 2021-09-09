package string;

public class StringClass {
public void stringMethods() {
	String s1 = "Java Developers";
	String s2 = "Velocity";
	String s3 = "velocity";
	String s4 = "VELOCITY";
	String s5 = "Mava";
	String s6 = new String("Velocity");
	
	System.out.println(s1.isEmpty());
	
	System.out.println(s1.length());
	
	System.out.println(s4.toLowerCase());
	
	System.out.println(s3.toUpperCase());
	
	System.out.println(s1.startsWith(s5));
	
	System.out.println(s2.endsWith(s3));
	
	System.out.println(s1.concat("  is developers"));
	
	System.out.println(s1.concat( s2));
	
	System.out.println(s2.charAt(4));
	
	System.out.println(s5.indexOf("v"));
	
	System.out.println(s1.lastIndexOf("v"));
	
	System.out.println(s1.substring(1));
	
	System.out.println(s1.substring(2, 5));
	
	System.out.println(s2.equals(s3));
	
	System.out.println(s2.equals(s6));
	
	System.out.println(s1 == s2);
	
	System.out.println(s2 == s6);
	
	System.out.println(s1.replace("Java",s5));
	
	System.out.println(s1.trim());
	
	System.out.println(s6.split("Vel"));
	
	
}


public static void main(String[] args) {
	StringClass z = new StringClass();
	z.stringMethods();
	
}
}
