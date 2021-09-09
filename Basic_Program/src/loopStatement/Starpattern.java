package loopStatement;

public class Starpattern {
	public void pp() {
		for(int i = 1;i<=9;i++) {//i=1(i<=4 is true now i=2 condition true goes next loop
			for(int j= 1;j<=i;j++) {//j=1 1<=2 is true j=2 then it print one star .the its goes to next line.
				
				
				System.out.print("*");
		}
			System.out.println();
	}


	
	}
	public static void main(String[] args) {
		Starpattern t = new Starpattern(); 
			t.pp();
		}
	}
