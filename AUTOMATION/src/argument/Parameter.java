package argument;

public class Parameter {

	int a;
	float b;
	static int c;
    static String x;
	
	public void student(int m,int r) {
		a=m;
		c=r;
		System.out.println("The value of a is: "+a);
		System.out.println("The value of c is: "+c);
	}
	
	public void data(float y) {
		b=y;
		System.out.println("The value of b is: "+b);
	}
	public static void verify(boolean q,boolean u,String p) {
		boolean h=q;
		boolean i=u;
		 x=p;
		System.out.println("The value of h is: "+h);
		System.out.println("The value of i is: "+i);
		System.out.println("The value of x is: "+x);
	}
	
	public static void main(String[] args) {
		
		Parameter ab=new Parameter();
		ab.student(90,56);
		ab.data(89.8f);
		verify(true,false,"Panzade");
		

	}

}
