package constructor_1;

public class Constructor_2 {
	static int a;
	int c;
public Constructor_2(){
	
	a = 65;
	System.out.println(a);
		
	}
public Constructor_2(String j) {
	c = 89;
	System.out.println(c);
	System.out.println(j );
	
}
public Constructor_2(long d) {
	c=100;
	System.out.println(d);
}

public static void main(String[] args) {
	new Constructor_2();
	new Constructor_2("Kunal");
	new Constructor_2(250L);
	
}

}
