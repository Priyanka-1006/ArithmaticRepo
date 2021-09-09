package conditionalStatement;

public class NestedIf {
	public void vote() {
		int age = 16;
		if(age < 25) {
			System.out.println("Not allow for voting");
			if(age>12)
				System.out.println("allow voting");
			
		}
		
	}
	public static void main(String[] args) {
		NestedIf b = new NestedIf();
		b.vote();
	}
	
	

}
