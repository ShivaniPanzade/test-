package loop_statement;

public class Nested_loop {

	public static void main(String[] args) {
		 
		for(int s=2; s<=6; s++) {
			System.out.println("The value of outer loop is : "+s);
			for(int h = 3; h<=5; h++) {
				System.out.println(h);
			}
		}

	}

}
