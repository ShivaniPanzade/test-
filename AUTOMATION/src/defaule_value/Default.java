package defaule_value;

public class Default {

	
	byte a;
	short b;
	int c;
	long d;
	
	float e;
	double f;
	
	char g;
	boolean h;
	
	String i;
	String j="shivani";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Default main=new Default();
       //integer
       System.out.println("The default value of byte is: "+main.a);
       System.out.println("The default value of short is: "+main.b);
       System.out.println("The default value of int is: "+main.c);
       System.out.println("The default value of long is: "+main.d);
       
       //floating
       System.out.println("The default value of float is: "+main.e);
       System.out.println("The default value of double is: "+main.f);
       
       //non-numeric
       System.out.println("The default value of char is: "+main.g);
       System.out.println("The default value of boolean is: "+main.h);
       
       //non-primitive
       System.out.println("The default value of string is: "+main.i);
       System.out.println("The value of string is: "+main.j);
       
       
       
	}

}
