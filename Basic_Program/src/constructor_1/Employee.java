package constructor_1;

public class Employee {
	
//declaration	
String a;

//Initialization
public Employee(int i) {
	a = "Priyanka Patil";
	System.out.println("The name of Employee is:-" + a);
	System.out.println("Employee Id Number is " + i );
	
}
public Employee(long k){
	a="Kunal Patil";
	System.out.println("The name of Employee is:-" + a);
	System.out.println("Employee Id Number is " + k);
}
public Employee(int j,String b) {
	a="Dhanuj Patil";
	System.out.println("The name of the Employe is :-" + a);
	System.out.println("The Employee id and position is:-" + j  + " and " +  b);
	
	
}

//usage
public static void main(String[] args) {
	new Employee(25);
	new Employee(69l);
	new Employee(89,"manager");	
}
}
