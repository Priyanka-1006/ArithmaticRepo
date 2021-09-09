package operators;

public class Right_Shift_Operator {
	int p = 25;
	int q = -25;
	int c = -50;
	public void right() {
		System.out.println(p>>2);//25 / 2^2 = 25/4=6
		System.out.println(q>>2);//-25/ 2^2 = -25/4=-6.25 =-7
		System.out.println(c>>2);//-50 / 2^2 = -50/4=-12.5=-13
		System.out.println(p>>>2);//25 / 2^2 = 25/4=6
		System.out.println(c>>>3);//-50 /2^3 = -50/8 = -6.25=-7
		
	}
	public static void main(String[] args) {
		Right_Shift_Operator a = new Right_Shift_Operator();
		a.right();
	}

}
