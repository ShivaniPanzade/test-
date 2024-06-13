package nested_loop;

public class Half_pyramid {

	public static void main(String[] args) {
		//row = 5
		//column = 5
		
		//half pyramid
		
		for(int j=1; j<=5; j++) {
			for(int k=1; k<=j; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		
		//for print number
		
		
		for(int j=1; j<=5; j++) {
			for(int k=1; k<=j; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		
		
		//combine row and column
		
		for(int j=1; j<=5; j++) {
			for(int k=1; k<=j; k++) {
				System.out.print(k+""+j+" ");
			}
			System.out.println();
		}
		
	}

}
