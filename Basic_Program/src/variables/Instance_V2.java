package variables;

public class Instance_V2 {
	String sr = "It is Instance Variable";
	String a = "Also called as Global/Non Static Method";
	static int c = 25;
	static int g = 50;
	public void string() {
		System.out.println(sr);
		System.out.println(a);
		System.out.println(c+g);
	
	}
	public static void main(String[] args) {
		Instance_V2 d = new Instance_V2();
		d.string();
		
		
	}

}
