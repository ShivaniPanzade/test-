package encapsulation;

public class A_001 {
	

	String password = "manual@123";
	
	private void login(String h) {
		password = h;
		System.out.println(h);
	}	
		
	public static void main(String[] args) {
		
		A_001 g=new A_001();
		g.login("12345");
			
		

	}

}
