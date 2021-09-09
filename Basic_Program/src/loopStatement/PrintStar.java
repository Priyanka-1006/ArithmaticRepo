package loopStatement;

public class PrintStar {
	public void dec() {
		for(int i = 9;i>=1;i-- ) {
			for(int j = 1;j<=i;j--) {
				System.out.print("&");
				
			}
			System.out.println("");
		}
	}
public static void main(String[] args) {
	PrintStar k =new PrintStar();
	k.dec();
}
}
