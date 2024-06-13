package abstraction;

public class Normal_class extends Abstract_class{

	public static void main(String[] args) {
		Normal_class b=new Normal_class();
		b.name();
		b.job();
		calculate();

	}

	@Override
	public void name() {
		System.out.println("automation");
		
	}

	@Override
	public void job() {
		System.out.println("API");
	}
	

}
