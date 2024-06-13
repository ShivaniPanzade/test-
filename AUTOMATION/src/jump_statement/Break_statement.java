package jump_statement;

public class Break_statement {

	public static void main(String[] args) {
		//for loop
		
		 for(int a=10; a>=1; a--) {
			 System.out.print(a+" ");
			 if(a==7) {
				 break;
			 }
		 }
		 System.out.println();
		 System.out.println("-------------------------------------");
		 
		 //While loop
		 
		 int b=15;
		 while(b>=1) {
			 System.out.print(b+" ");
			 if(b==11) {
				 break;
			 }
			b--; 
		 }
		 System.out.println();
		 System.out.println("--------------------------------------------");
		 
		 //do while loop
		 
		 int c=10;
		 do {
			 System.out.print(c+" ");
			 if(c==5) {
				 break;
			 }
			 c--;
		 }while(c>=1);
			 
			 
		 
	}

}
