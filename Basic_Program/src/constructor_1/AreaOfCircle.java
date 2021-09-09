package constructor_1;

public class AreaOfCircle{
	
	float pie;
	float r;
	public AreaOfCircle() {
		
		pie =  3.14f;
		r = 4.5f;
		float area = pie*r*r;
		System.out.println(area);
	}

	
	
	public static void main(String[] args) {
		new AreaOfCircle();
	}
		
		
	}
	


