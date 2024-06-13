package interface_;

public class Normal_class implements Interface1,Interface2{

	public static void main(String[] args) {
		Normal_class w=new Normal_class();
		w.school();
		w.rollno();
		w.girl();

		System.out.println(w.a);
		System.out.println(w.b);
		System.out.println(w.c);
		System.out.println(w.r);
		System.out.println(w.d);
		
		
		//Interface d=new Normal_class();
		//Interface2 f=new Normal_class();
	}

	@Override
	public void rollno() {
		System.out.println("mumbai");
		
	}

	@Override
	public void school() {
		System.out.println("delhi");
	}

	@Override
	public void girl() {
		System.out.println("women");
		
	}

}
