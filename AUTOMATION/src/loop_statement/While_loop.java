package loop_statement;

public class While_loop {

	public static void main(String[] args) {
		//print no 70 to 100
		int a=70;
		while(a<=100) {
			System.out.print(a+" ");
			a++;
		}
       System.out.println("  ");
       System.out.print("------------------------------------------------------------------------------");
       System.out.println("  ");
       
      //print no 100 to 70 reverse 
       int b = 100;
       while(b>=70) {
    	   System.out.print(b+ " ");
    	   b--;
       }
       System.out.println("  ");
       System.out.print("------------------------------------------------------------------------------");
       System.out.println("  ");
       
      //even number 
       int c = 0;
       while(c<=100) {
    	   if(c%2==0) {
    		   System.out.print(c+" ");
       }
       c++;
       }
       
       System.out.println("  ");
       System.out.print("------------------------------------------------------------------------------");
       System.out.println("  ");
       
     //reverse even number  
       int d = 100;
       while(d>=0) {
    	   if(d%2==0) {
    		   System.out.print(d+" ");
    	   }
    	   d--;
       }
       System.out.println("  ");
       System.out.print("------------------------------------------------------------------------------");
       System.out.println("  ");
       
       //odd number
       int e = 0;
       while(e<=80) {
    	   if(e%2 != 0) {
    		   System.out.print(e+" ");
    	   }
    	   e++;
       }
       System.out.println("  ");
       System.out.print("------------------------------------------------------------------------------");
       System.out.println("  ");
       
       //odd number in reverse
       int f = 80;
       while(f>=0) {
    	   if(f%2 !=0) {
    		   System.out.print(f+" ");
    	   }
    	   f--;
    	   
       }
       
       System.out.println("  ");
       System.out.print("------------------------------------------------------------------------------");
       System.out.println("  ");
       
       
        
       } 
	}
	

