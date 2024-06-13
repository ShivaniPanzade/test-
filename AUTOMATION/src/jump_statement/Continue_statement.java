package jump_statement;

public class Continue_statement {

	public static void main(String[] args) {
		
		//for loop
		for(int a=20;a>=1;a--) {
			if(a==12) {
				continue;
			
			}
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------");
		
		//while loop
		
		int b=15;
		while(b>=1) {
			b--;
			if(b==8) {
				continue;
				
			}
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------");
		
		//do while loop
		
		int c=25;
		do {
			c--;
			if(c==21) {
				continue;
				
			}
			System.out.print(c+" ");
		}while(c>=1);
		}
	}
	
	


