package operators;

public class And1 {
	int p = 10;
	int q = 20;
	public void add() {
		System.out.println(p<q && p >q);//true && false =false
		System.out.println(p>q && p<q);//false && true = false
		System.out.println(p>q && p>q);//false && false= false
		System.out.println(p<q && q>p);//true && true =true
		
		System.out.println(p<q & p >q);//true & false =false
		System.out.println(p>q & p<q);//false & true = false
		System.out.println(p>q & p>q);//false & false= false
		System.out.println(p<q & q>p);//true & true =true
		
		
		System.out.println(p<q || p >q);//true || false = true
		System.out.println(p>q || p<q);//false || true = true
		System.out.println(p>q || p>q);//false || false= false
		System.out.println(p<q || q>p);//true || true = true
		
		System.out.println(p<q | p >q);//true | false =true
		System.out.println(p>q | p<q);//false | true = true
		System.out.println(p>q | p>q);//false | false= false
		System.out.println(p<q | q>p);//true | true = true
	
	}
	public static void main(String[] args) {
		And1 z = new And1();
		z.add();
		
	}

}
