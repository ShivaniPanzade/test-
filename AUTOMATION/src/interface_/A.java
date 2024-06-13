package interface_;

public class A {
	float a=3.5f;
	
	public void book(int t) {
		a=t;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		A main =new A();
		System.out.println(main.a);
		main.book(40);
	}

}
