package arraypractise;

public class Array1 {
	//dataType[] variableName;
	//dataType []variableName;
	//dataType variableName[];
	
	public void array2() {
	
 String str[]=new String[6]; 
     str[0] ="Priyanka";
     str[1] ="Kunal";
     str[2] ="Dhanuj";
     str[3] ="Vandana";
     str[4] ="Jaggnath";
     str[5] ="waiting";
     
     System.out.println(str[5]);
      int len=str.length;
      System.out.println(len);
}
	public static void main(String[] args) {
		Array1 a = new Array1();
		a.array2();
	}
}
