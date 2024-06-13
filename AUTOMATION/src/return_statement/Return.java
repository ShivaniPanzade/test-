package return_statement;

public class Return {
	
//1.without return type an no parameters
	
	public void lenovo() {
		System.out.println("computer");

	}
	//2.without return type and with parameter
	
	public static void subject(String English) {
		System.out.println("subject :" + English);
		
	}
//3.with return statement and parameters
	public void mobile(int a) {
		System.out.println("The value of a : " + a);
		return;
	}
	//4.with return type and having parameters
	public int substraction(int b,int c) {
		return b-c;
	}
	public static String cat(String f) {
		return f;
	}
		public static String data(String g) {
			return "manual testing";
		}
		
		
		public static void main (String[] args){
			Return r = new Return();
			
			r.lenovo();
			subject("computer");
			r.mobile(20);
			System.out.println(r.substraction(500, 200));
			System.out.println(cat("india"));
			System.out.println(data("security"));
		
		}
	}

