package nested_loop;

public class Inverted_half_pyramid {

	public static void main(String[] args) {
		
		//7 row and 7 column
		
		for(int s=7; s>=1; s--) {
			for(int h=1; h<=s; h++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------");
		
		//for print number
		
		for(int s=7; s>=1; s--) {
			for(int h=1; h<=s; h++) {
				System.out.print(h+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------");
		
		
		//for combine row and column
		

		for(int s=7; s>=1; s--) {
			for(int h=1; h<=s; h++) {
				System.out.print(h+""+s+" ");
			}
			System.out.println();
		}
	}

}
