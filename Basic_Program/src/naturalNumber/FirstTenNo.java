package naturalNumber;

public class FirstTenNo {
public void pp() {
	int i;
	for(i = 1;i <=10;i++) { //(positive interger)
		System.out.println(i);
	}
	
}
public static void main(String[] args) {
	System.out.println("First 10 Natural Number");
	FirstTenNo z = new FirstTenNo();
	z.pp();
}
}
