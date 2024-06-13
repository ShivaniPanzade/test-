package constructor;

public class Class_2 {
	
	
	public Class_2(String f) {
		this(908,66,6.7f);
		System.out.println("Constructor 1");
	}
	
    public Class_2(long d) {
		this(34.9f,"manual");
		System.out.println("Constructor 2");
	}
    
    public Class_2(double m,int r,float k) {
	this(100);
	System.out.println("Constructor 3");
    }
    
    public Class_2(float e,String z) {
	System.out.println("Constructor 4");
    }
    
	public static void main(String[] args) {
		Class_2 method=new Class_2("automation");
		
	}

}
