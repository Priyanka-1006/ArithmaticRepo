package arraypractise;

import java.util.Arrays;

public class Array3 {
	public void array3() {
		int []a = {1,2,93,26,5};//declaration + initialization
		System.out.println(a[4]);
		System.out.println(a[3]);
		System.out.println(a[2]);
		System.out.println(a[1]);
		System.out.println(a[0]);
		System.out.println("print length of array" + a.length);
		for(int i:a) {
			System.out.println(i);
		}
		
		
		System.out.println("ascending order");
		Arrays.sort(a);
		for(int i = 0;i< a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		System.out.println("decending order");
		Arrays.sort(a);
		for(int i = a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
	public static void main (String[] args) {
		Array3 z = new Array3();
		z.array3();
		
	}
 
}
