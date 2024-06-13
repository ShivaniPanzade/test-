package constructor;

public class This_keyword {
	public This_keyword() {
		this(89);
		System.out.println("user defined constructor");
		
	}
	public This_keyword(int z) {
		this(6,"main");
		System.out.println("parameterized constructor");  
	}
    public This_keyword(int r,String h) {
    System.out.println("parameterized constructor 1"); 
    }
	public static void main(String[] args) {
		This_keyword student =new This_keyword();
		
		 

	}

}
