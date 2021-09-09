package operators;

public class Arthimatic_Operation {
	 public void add() {
	 int a = 45;
	 int b = 75;
	 float f = 34.5f;
	 float g = 13.5f;
	 System.out.println(a+b);//45+75=120
	 System.out.println(b-a);//75-45=30
	 System.out.println(a-b);
	 System.out.println(f-g);
	 System.out.println(f+g);
	 }
	 public void mul() {
		 int a =34;
		 float k = 12.58f;
		 System.out.println(a*k);
	 }
	 public void div() {
		 int p = 600;
		 int r = 3;
		 float q = 10;
		 
		 System.out.println(p/q);
		 System.out.println(p/r);
		 System.out.println(p%r);//output is always remander 
	 }
	 public static void main(String[] args) {
		 Arthimatic_Operation d = new Arthimatic_Operation();
		 d.add();
		 d.mul();
		 d.div();
	 }
	 
}
