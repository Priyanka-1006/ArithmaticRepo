package constructor_1;

public class Employee_Id {
	//Declaration
	String name;
	String id;
	//Intilization 
public Employee_Id() {
	name = "Rohan ";
	id = "Roh123 ";
	System.out.println(name + id);
}
public Employee_Id(String name1, String id1) {
	name = name1;
	id = id1;
	System.out.println(name + id);
	
}
//Usage
public static void main (String[] args) {
	 new Employee_Id();
	 new Employee_Id("Nikhil "," Nik123");
	 
	
}

}
