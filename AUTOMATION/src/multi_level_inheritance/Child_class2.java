package multi_level_inheritance;

public class Child_class2 extends Child_class1{
 public void state() {
	 System.out.println("instance method");
 }
 
	public static void main(String[] args) {
		Child_class2 imp=new Child_class2();
		imp.amravti();
		System.out.println(imp.t);
		imp.state();
		

	}

}
