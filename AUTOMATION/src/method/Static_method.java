package method;

public class Static_method {

		
		public static void subject() {
			System.out.println("automation testing");
			System.out.println("mobile testing");
			
		}
			
		public static void main(String[] args) {
		//1st way access static method
			subject();
			System.out.println("-------------------------------------------");
			//2nd way access static method
			Static_method.subject();
		}
	}


