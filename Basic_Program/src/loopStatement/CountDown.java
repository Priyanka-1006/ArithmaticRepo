package loopStatement;

public class CountDown {
	public void loop() {
		int i;
		for (i = 10;i>=0;i--) {
			System.out.println(i);
		
	}
}
	public void aj() {
		int a;
		for (a=999;a>=970;a--) {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		CountDown z = new CountDown();
		z.loop();
		z.aj();
	}

}
