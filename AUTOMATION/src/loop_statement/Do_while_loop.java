package loop_statement;

public class Do_while_loop {

	public static void main(String[] args) {
		
		
		//print no 10 to 20
		int a = 10;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<=20);
		
	 System.out.println("  ");
     System.out.print("------------------------------------------------------------------------------");
     System.out.println("  ");
     
     
     //print no in reverse 20 to 10
     int a1 = 20;
		do {
			System.out.print(a1+" ");
			a1--;
		}while(a1>=10);
		
	 System.out.println("  ");
     System.out.print("------------------------------------------------------------------------------");
     System.out.println("  ") ;
        
      //even number
     int b = 20;
     do {
    	 if(b%2==0) {
    	 System.out.print(b+" ");
     }
    	 b++;
	}while(b<=80);
     
     System.out.println("  ");
     System.out.print("------------------------------------------------------------------------------");
     System.out.println("  ");
        
     // reverse even no
     int b1 = 80;
     do {
    	 if(b1%2==0) {
    	 System.out.print(b1+" ");
     }
    	 b1--;
	}while(b1>=20);
     
     System.out.println("  ");
     System.out.print("------------------------------------------------------------------------------");
     System.out.println("  ");
          
     //odd number
     int c = 10;
     do {
    	 if(c%2!=0) {
    		 System.out.print(c+" ");
    	 }
    	 c++;
     }while(c<=100);
     
     System.out.println("  ");
     System.out.print("------------------------------------------------------------------------------");
     System.out.println("  ");
     
     //reverse odd number
     int c1 = 100;
     do {
    	 if(c1%2!=0) {
    		 System.out.print(c1+" ");
    	 }
    	 c1--;
     }while(c1>=10);
     
     System.out.println("  ");
     System.out.print("------------------------------------------------------------------------------");
     System.out.println("  ");
     
         
     
    
     
 
	}
	
}



