package operator;

public class Arithmatic_operator {

	public static void main(String[] args) {
		//addition
		int a=3;
		float b=56.98f;
		float z=a+b;
		System.out.println("Addition of a and b is : "+z);
		System.out.println("---------------------------------------------------------");
		
		//substraction
		double c=22.90;
		short d=9;
		
		System.out.println("Substraction of c and d is: "+(c-d));
		System.out.println("-----------------------------------------------------------");
		
		//multiplication
		long e=76;
		byte f=70;
		
		System.out.println("Multiplication of e and f is : "+(e*f));
		System.out.println("----------------------------------------------------------");
		
		//division
		int h=76;
		int i=7;
		
		System.out.println("Division of i and h is : "+(h/i));
		System.out.println("------------------------------------------------------------");

		
		//increment
	     int j=76;
	     System.out.println(++j);
	     
	     //decrement
	     System.out.println(--j);
	}

}
