package conditionalStatement;

public class SwitchMark {
	public void mark() {
		String name = "Priyanka";
		switch(name) {
		case "Priyanka" : System.out.println("Sunday");break;
		case "Sukhade" : System.out.println("Saturday");break;
		case "Pranav" : System.out.println("Wednesday");break;
		case "Chaitanya" : System.out.println("Thursday");break;
		
				
		}
	}
	public static void main(String[] args) {
		SwitchMark b = new SwitchMark();
		b.mark();
	}

}
