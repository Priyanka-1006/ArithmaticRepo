package operators;

public class Left_Shift_Operator {
	int a = 45;
	int b = -45;
	public void left() {
		System.out.println(a<<2);//45 * 2^2 = 45 * 4= 180
		System.out.println(b<<2);//-45 * 2^2 = -45 * 4 = -180
	}
	public static void main(String[] args) {
		Left_Shift_Operator s = new Left_Shift_Operator();
		s.left();
		
	}

}
