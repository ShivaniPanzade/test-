package scanner_class;

import java.util.Scanner;

public class Using_switch {

	public static void main(String[] args) {
		
		Scanner ab=new Scanner(System.in);
		
		System.out.print("The value of s : ");
		int s=ab.nextInt();
		System.out.print("The value of h : ");
		int h=ab.nextInt();
		System.out.println("Select an operator : +,-,*,/");
		char i=ab.next().charAt(0);
		switch(i) 
		{
		case '+':
    		System.out.println("Addition of s and h is : "+(s+h));
    		break;
    		
    	case'-':
    	    System.out.println("Substraction of s and h is : "+(s-h));
    		break;
    		
    	case'*':
    	    System.out.println("Multiplication of s and h is : "+(s*h));
    		break;
    		
    	case'/':
    		System.out.println("Division of s and h is : "+(s/h));
    		break;
    		
    		default:
    			System.out.println("You have entered wrong operator");
    			break;
    			
		}
		
	}

}
