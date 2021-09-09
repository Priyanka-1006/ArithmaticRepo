package variables;

public class All_In_One {
int a = 10;
int b = 25;
 static String s = "Static Variable";
 public static void main(String[] args) {
	 char ch = 'P';
	 System.out.println(ch);
	 System.out.println(s);
	 All_In_One c = new All_In_One();
	 c.add();
	 multiply();
	
	 System.out.println(c.a*c.b);
	 }
 public void add() {
	 System.out.println("the value is" + (a+b));
	 
 }
 public static void multiply() {
	 System.out.println(s);
	
 }
}
