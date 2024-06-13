package method;

public class Instance_method {
	int z=7;
	
	public void login() {
		int x=78;
		System.out.println(x);
		float d=43.34f;
		System.out.println(d);
	}

	public static void main(String[] args) {
		Instance_method s=new Instance_method();
		System.out.println(s.z);
		s.login();
		
		
		
	}
}


