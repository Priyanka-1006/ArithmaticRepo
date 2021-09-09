package conditionalStatement;

public class NestedIfElse {


	public void kp() {
	int age = 25;
	int weight = 48;
	if(age>=18) {
		if(weight>50) {
			System.out.println("they can donate blood");
		}
			else {
				System.out.println("they not eligible");
			}
	}
		else {
					System.out.println("weight should be 40");
				}
				}
			
		
	
	
	public static void main(String[] args) {
	NestedIfElse k = new NestedIfElse();
	k.kp();
	}
}

