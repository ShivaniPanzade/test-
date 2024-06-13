package variable;

public class Instance_variable {
	//instance variable
    int a=80;
    String b="shivani";
    //instance method
    public void add() {
    	System.out.println(a);
    	System.out.println(b);
    }
    //static method
    public static void sum() {
    	Instance_variable sh=new Instance_variable();
    	System.out.println(sh.a);
    	System.out.println(sh.b);
    }
	public static void main(String[] args) {
		Instance_variable max = new Instance_variable();
		System.out.println(max.a);
		System.out.println(max.b);
		max.add();
		sum();
		
		
		

	}

}
