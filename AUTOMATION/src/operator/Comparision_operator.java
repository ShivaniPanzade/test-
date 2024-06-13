package operator;

public class Comparision_operator {

	public static void main(String[] args) {
		
		// greater than
		int a=56;
		int b=78;
		int x=89;
		
		boolean c=a>b;
		System.out.println(c);
		System.out.println("------------------------------------------------------");
		
		//less than
		boolean d=a<b;
		System.out.println(d);
		System.out.println("----------------------------------------------------------");
		
		//equals to
		System.out.println(a==b);
		System.out.println("--------------------------------------------------");

		//not equals to
		System.out.println(a!=b);
		System.out.println("--------------------------------------------------");

		//grater than equal to
		boolean p=b>=x;
		System.out.println(p);
		
		System.out.println("--------------------------------------------------");
		boolean g=a<=x;
		System.out.println(g);
		System.out.println("--------------------------------------------------");

		boolean h=a>=x;
		System.out.println(h);
		System.out.println("--------------------------------------------------");

		boolean t=a<100;
		System.out.println(t);
		System.out.println("-------------------------------------------");
		
		
	}

}
