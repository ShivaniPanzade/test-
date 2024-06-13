package loop_statement;

public class For_loop {

	public static void main(String[] args) {
		
		//print number 51 to 60
		for(int s=51; s<61; ++s) {
			System.out.println(s);
		}
		
        System.out.println("--------------------------------------------");
        
        //print number 60 to 51
        for(int h = 60; h>=51; h--) {
        	System.out.println(h);
        }
	
         System.out.println("-----------------------------------------------------");


      //Even number 
     for(int i=1; i<=50; i++) {
	  if(i % 2 == 0) {
		System.out.println(i);
	}}
	  System.out.println("----------------------------------------------------------");
	  
	  
	  
	  //Even number for reverse
	  for(int j=50; j>=1; j--) {
		  if(j % 2 == 0 ) {
			  System.out.println(j);
		  }
		  }
	  System.out.println("---------------------------------------------------------");
		
	  
       //Odd number
    for(int k=1; k<=50; k++) {
	if(k % 2 != 0) {
		System.out.println(k);
	}
	}
    System.out.println("----------------------------------------------");
		
    
    //Odd number for reverse
    for(int l = 50; l>=1; l--) {
	if(l % 2 != 0) {
		System.out.println(l);
	}
    }
    
   System.out.println("------------------------------------------------------");
   
	

   //To print the table 5
   for(int m = 1; m<=10; m++) {
	   System.out.println(5*m);
   }
   System.out.println("------------------------------------------------------");
   
   
   
   //even number 1 to 140
   for (int n = 1; n<=70; n++){
	   System.out.println(2*n);
   }
   System.out.println("-----------------------------------------------------------");
   
   
   
   //6*1=6
   //6*2=12
   for(int o = 1; o<=10; o++) {
	   System.out.println("6*"+o+"="+(6*o));
   }
   System.out.println("-----------------------------------------------------------");
	}
	
}
