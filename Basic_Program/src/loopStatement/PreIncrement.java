package loopStatement;

public class PreIncrement {
	public void kp() {
		int i;
		for(i= 10;i <= 25;++i) {//10=+1=11
			System.out.println(i);
		}
	}
	public void pp() {
		int a;
		for (a=30; a<=40; --a) {
		}
		}
	
public static void main(String[] args) {
	PreIncrement z = new PreIncrement();
	z.kp();
	z.pp();
}
}
