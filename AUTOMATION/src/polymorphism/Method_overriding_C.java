package polymorphism;

public class Method_overriding_C extends Method_overriding_P{
	
	public void state() {
		System.out.println("state method from child class");
	}

	public static void main(String[] args) {
		//child class object
		Method_overriding_C k=new Method_overriding_C();
		k.state();
		
		//3rd property of inheritance
		Method_overriding_P w=new Method_overriding_C();
		w.state();
		
		//has relationship
		Method_overriding_P w1=new Method_overriding_P();
		w1.state();
		
	}

}
