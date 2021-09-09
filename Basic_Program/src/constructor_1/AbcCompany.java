package constructor_1;

public class AbcCompany {
	String name;
	String Address;
	String Position;
	
	
	public AbcCompany() {
		name= "Trupti ";
		Address = "Jalna ";
		Position = "Team Lead ";
		System.out.println("Name of emplyoee:-"+ name + "\n"+  "Address:-"+  Address + "\n" + "Current position:- " +
		Position);
		
	}
	
	public AbcCompany(String name1,String Address1,String Position1) {
		name =  name1;
		Address = Address1;
		Position = Position1;
		System.out.println("Name of emplyoee:-"+ name + "\n"+  "Address:-"+  Address + "\n" + "Current position:- " +
				Position);
		}
	public AbcCompany(String name2,String Address2,String Position2,int i) {
		name = name2;
		Address = Address2;
		Position = Position2;
		System.out.println("Name of emplyoee:-"+ name + "\n"+  "Address:-"+  Address + "\n" + "Current position:- " +
				Position);
	}
	
	
	
	
	public static void main(String[] args) {
		 new AbcCompany();
		 new AbcCompany("Siddhi ","Pune "," Qa Tester");
		 new AbcCompany("Priyanka","Malkapur","Tester");
		 
	}
		
		
	}
	


