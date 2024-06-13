package constructor;

public class Class_1 {
	
	public Class_1 () {
		System.out.println("User defined constructor");
		System.out.println("--------------------------------------------");
	}
	public void teacher (){
		System.out.println("Login functionality");
		System.out.println("--------------------------------------------");
	}
	public Class_1(int v,float n,String h) {
		System.out.println("It is a parameterized constructor");
		System.out.println("First value is : "+v);
		System.out.println("Second value is : "+n);
		System.out.println("Third value is : "+h);
	}

	public static void main(String[] args) {
		Class_1 student=new Class_1();
		student.teacher();
		Class_1 d=new Class_1(3,34.3f,"shivani");
	}

}
