package polymorphism;

public class Method_overloading {
	
	public void city() {
		System.out.println("city method without parameter");
	}
	public void city(int g) {
		System.out.println("city method with int parameter");
	}
	public void city(float t) {
		System.out.println("city method with float parameter");
	}
	public void city(String u) {
		System.out.println("city method with string parameter");
	}

	public static void main(String[] args) {
		Method_overloading o=new Method_overloading();
		o.city();
		o.city(10);
		o.city(4.5f);
		o.city("manual");
	}

}
