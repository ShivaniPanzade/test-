package hierarchical_inheritance;

public class Child2 extends parent_class{
	public void book() {
		int x=78;
		System.out.println(x);
	}

	public static void main(String[] args) {
		Child2 hj=new Child2();
		hj.college();
		hj.book();
	}

}
