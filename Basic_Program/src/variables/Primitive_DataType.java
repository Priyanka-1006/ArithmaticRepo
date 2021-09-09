package variables;

public class Primitive_DataType {
	public static void main(String[] args) {
		Primitive_DataType value = new Primitive_DataType();
		value.information();
		
	}
	public void information() {
		byte a = 0;
		int b =127;
		long d=5896471555l;
		short l=7894;
		boolean c = true;
		boolean f =false;
		char ch = 'e';
		float h = 12.58945f;
		double g = 256.225824558155d;
		int j = -128;
		int k =127;
		short w=-32768;
		short z=32767;
		System.out.println(a);
		System.out.println(b + d + l);
		System.out.println(ch);
		System.out.println(h);
		System.out.println(c + "\n"+ f);
		
		System.out.println(w);
		System.out.println(g);
		System.out.println(j + k);
		System.out.println(z);
		System.out.println(c + "\n" + a);
		System.out.println(b + h);
		
		
	}

}
