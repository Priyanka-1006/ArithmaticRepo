package variables;

public class Instance_Variable1 {
	int d = 500;
	int f = 300;
	static int k = 100;
	static int p = 800;
	 public void add() {
		 System.out.println("the addtion of two number is " + (d + f));
		 System.out.println("the mutiplication is " + (k*p));
	 }
	 public static void minus() {
		 System.out.println(p-k);
	 }
	 public static void main(String[] args) {
		 minus();
		 Instance_Variable1 sp = new Instance_Variable1();
		 sp.add();
	 }

}
