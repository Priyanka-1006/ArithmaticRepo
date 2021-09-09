package conditionalStatement;

public class ElseIfElse {
	public void grade() 
	{
		int marks = 59;
		if(marks > 65) {
			System.out.println("Grade A+");
		}
			else if (marks < 65 && marks >50) {
			System.out.println("Grade B");
			}
			else if (marks < 49 && marks >40) {
				System.out.println("Grade C");
			}
			else {
				System.out.println("Fail");
			}
			
		}
	public static void main(String[] args) {
		ElseIfElse c = new ElseIfElse();
		c.grade();
	}

}
