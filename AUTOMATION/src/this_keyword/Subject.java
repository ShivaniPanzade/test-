package this_keyword;

public class Subject {

	String d = "Manual";

	public void function() {
		System.out.println("verify functionality");
	}

	public Subject() {
		System.out.println(this.d);
		this.function();
		System.out.println("user define constructor");
	}

	public static void main(String[] args) {
		Subject r = new Subject();

	}

}
