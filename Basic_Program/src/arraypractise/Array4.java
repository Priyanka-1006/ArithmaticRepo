package arraypractise;

import java.util.Arrays;

public class Array4 {
	public static void main(String[] args) {
		String[] a = {"cat","dog","cow","ox"};
		
		System.out.println("orignal sequence");
		for (String i:a) {
			System.out.println(i);
		}
		System.out.println("ascending order");
		Arrays.sort(a);
		for(int i = 0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		System.out.println("decending order");
		for (int i = a.length-1;i>=0;i--) {
			System.out.println(a[i]);
			
		}
}

}
