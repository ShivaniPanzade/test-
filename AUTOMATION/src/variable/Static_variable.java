package variable;

public class Static_variable {
	
    //static variable
	static int d = 67;
	static float l = 89.90f;

	// instance method
	public void fun() {
		System.out.println(d);
		System.out.println(l);
	}

	// static method
	public static void jump() {
		System.out.println(d);
		System.out.println(l);
	}

	public static void main(String[] args) {

		Static_variable sh = new Static_variable();
		System.out.println(sh.d);
		System.out.println(Static_variable.l);
		sh.fun();
		jump();

	}

}
