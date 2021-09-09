package loopStatement;

public class SquareStar {
	public void star() {
		int n = 5;
		for(int i = 1;i <=n;i++) {
			for(int j = 1;j<=n;j++) {
		            System.out.print("* ");
	}
		
		            System.out.println("");
		}

}
	public static void main(String[] args) {
		SquareStar k = new SquareStar();
		k.star();
	}
}
