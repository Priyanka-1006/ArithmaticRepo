package conditionalStatement;

public class MarksPercentage {
	public static void marks() {
		int i = 80;
		if(i < 90) {
			System.out.println("Grade is B");
			if(i >= 91) {
				System.out.println("Grade is A");
				if(i<50 && i>35) {
					System.out.println("Grade id D");
				}
			}
		}}
		
	
	public static void main(String[] args) {
		marks();
	}

}
