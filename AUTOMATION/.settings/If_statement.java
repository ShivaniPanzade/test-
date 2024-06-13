package dicision_making_statements;

public class If_statement {

	public static void main(String[] args) {
		int a=25;
		if (a>15) {
			System.out.println("a is grater than 15");
			if (a<10) {
				System.out.println("a is grater than 10");	
			
				if(a==25 && a<20) {
					System.out.println("execute block of code");		
				}
			}
				
			
		}

	}

}
