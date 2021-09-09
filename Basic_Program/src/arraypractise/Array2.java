package arraypractise;

public class Array2 {
	public void array0() {
		int f[] = new int[5];
		f[0]= 10;
		f[1] = 20;
		f[2] = 30;
		f[3] = 40;
		f[4] = 50;
		
		System.out.println(f[3]);
		System.out.println("print all numbers");
		for(int i = 0;i<f.length;i++) {
			System.out.println(f[i]);
		}
			System.out.println("print in reverse ");
			for(int i = f.length-1;i>=0;i--) {
				System.out.println(f[i]);
				
		}
			System.out.println("print only above four");
			for(int i = 0;i<f.length-1;i++) {
				System.out.println(f[i]);
				
			}
			
		
	    
	}
	public static void main(String[] args) {
		Array2 b = new Array2();
		b.array0();
	}

}
