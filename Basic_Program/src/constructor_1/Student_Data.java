package constructor_1;

public class Student_Data {
String name;
String id;
String dob;
long mo_no;
public Student_Data() {
	name = "Pranav Nagpure ";
	id = "Pra123 ";
	dob = "9/10/1992 ";
	mo_no = 8446331527l;
	System.out.println(name +  id +  dob +  mo_no);
}
public Student_Data(String name1,String id1,String dob1,long mo_no1){
	name = name1;
	id = id1;
	dob = dob1;
	mo_no= mo_no1;
	System.out.println(name+id+dob+mo_no);
}
public Student_Data(String name2,String dob2,long mo_no2,String id2) {
	name = name2;
	id = id2;
	dob = dob2;
	mo_no = mo_no2;
	System.out.println(name + id + dob+ mo_no);
}
	

public static void main(String[] args) {
	new Student_Data();
	new Student_Data("Sukhad Jirole ", "Suk123 " , "26jan " , 9403007489l);
	new Student_Data("Chatanya Bhagwat ","19/02/1994 ",9404168495l ,"Cha123 s");
}
}

