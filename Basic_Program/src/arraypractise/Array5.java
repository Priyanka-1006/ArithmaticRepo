package arraypractise;

public class Array5 {
public static void main(String[] args) {
	int[][] a = {{1,2,3},{4,5,6}};
	System.out.println(a[0][0]);
	System.out.println(a[0][1]);
	System.out.println(a[0][2]);
	System.out.println(a[1][0]);
	System.out.println(a[1][1]);
	System.out.println(a[1][2]);
	for(int i = 0 ;i<a.length;i++) {
		for(int j= 0;j<a.length+1;j++) {
			System.out.print(a[i][j]+ " ");
		}
			System.out.println("");
		}
		
	}
	
	
	
}

