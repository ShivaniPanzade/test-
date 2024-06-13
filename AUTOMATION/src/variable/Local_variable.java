package variable;

public class Local_variable {
	
    //instance method
	public void function() {
		int b=80;
		System.out.println(b);
	}
	public void input() {
		byte v=8;
		System.out.println(v);
	}
	//static method
	public static void num() {
		int x=78;
		System.out.println(x);
		char f='b';
		System.out.println(f);
	}
	public static void main(String[] args) {
	int g=68;
	System.out.println(g);
	
	Local_variable f=new Local_variable();
	f.function();
	f.input();

	}

}
