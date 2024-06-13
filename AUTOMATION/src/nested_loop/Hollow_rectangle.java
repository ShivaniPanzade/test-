package nested_loop;

public class Hollow_rectangle {

	public static void main(String[] args) {
		//row=6 and column=7
		
		//hollow rectangle
		
				for(int e=1; e<=6; e++) {
					for(int f=1; f<=7; f++) {
						if(e==1||e==6||f==1||f==7) {
							System.out.print("* ");
						}else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				System.out.println("----------------------------------------------------------");
				
				//for print number
				
				for(int e=1; e<=6; e++) {
					for(int f=1; f<=7; f++) {
						if(e==1||e==6||f==1||f==7) {
							System.out.print(f+" ");
						}else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				System.out.println("----------------------------------------------------------");
				
				//for combine row and column
				
				for(int e=1; e<=6; e++) {
					for(int f=1; f<=7; f++) {
						if(e==1||e==6||f==1||f==7) {
							System.out.print(f+""+e+" ");
						}else {
							System.out.print("   ");
						}
					}
					System.out.println();
				}	
					
	}

}
