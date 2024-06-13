package nested_loop;

public class Solid_rectangle {

	public static void main(String[] args) {
		
		//row=4 and column=5
		//solid rectangle
		
		for(int c=1; c<=4; c++) {
			for(int d=1; d<=5; d++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		
		//for print number
		
	for(int c=1; c<=4; c++) {
		for(int d=1; d<=5; d++) {
			System.out.print(d+" ");
		}
		System.out.println();
	}
	System.out.println("----------------------------------------------");
	
	
	//for combine row and column
	
	for(int c=1; c<=4; c++) {
		for(int d=1; d<=5; d++) {
			System.out.print(d+""+c+" ");
		}
		System.out.println();
	}
	}
}
