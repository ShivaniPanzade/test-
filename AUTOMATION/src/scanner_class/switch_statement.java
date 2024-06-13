package scanner_class;

import java.util.Scanner;


public class switch_statement {
     public static void main(String[] args) {
    	float a,b;
    	
        Scanner sc=new Scanner(System.in);
   	 
        System.out.print("Enter the first value : ");
    	a=sc.nextFloat();
    	
    	
    	System.out.print("Enter the second value : ");
    	b=sc.nextFloat();

        
    	System.out.println("Select an operator : +, -, *, /");
    	char operator=sc.next().charAt(0);
    	
        float c;
    	switch(operator)
    	{
    	case '+':
    		c=a+b;
    		System.out.println("Addition of a and b is : "+c);
    		break;
    		
    	case'-':
    		c=a-b;
    		System.out.println("Substraction of a and b is : "+c);
    		break;
    		
    	case'*':
    		c=a*b;
    		System.out.println("Multiplication of a and b is : "+c);
    		break;
    		
    	case'/':
    		c=a/b;
    		System.out.println("Division of a and b is : "+c);
    		break;
    		
    		default:
    			System.out.println("You have entered wrong operator");
    			break;
    			
    	}
    	
	}

}
