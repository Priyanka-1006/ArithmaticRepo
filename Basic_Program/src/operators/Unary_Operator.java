package operators;

public class Unary_Operator {
	int a = 25;
	int b = 36;
	int c = 54;
	

	public void add() {
		System.out.println(a);// 25
		System.out.println(b); // 36
		System.out.println(a++);//first read a=25 then a+1 mean 25+1=26 .now a store 26
		System.out.println(-a);
		System.out.println(+a);//
		System.out.println(a);// a=26 from already store value.
		System.out.println(a--);//26  26-1=25
		System.out.println(++b);//1+36=37
		System.out.println(--b);//37-1=36
		System.out.println(b++);//36     36+1=37
		System.out.println(b--);//37 37-1=36
		System.out.println(+b);//36
		System.out.println(-b);//-36
		System.out.println(+a);//25
		System.out.println(-a);//-25
		System.out.println(~a);
		System.out.println(~c);
		System.out.println(+c);//54
	}
	public static void main(String[] args) {
		Unary_Operator z = new Unary_Operator();
		z.add();
	}

}
