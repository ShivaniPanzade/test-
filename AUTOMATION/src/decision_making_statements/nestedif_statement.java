package decision_making_statements;

public class nestedif_statement {

	public static void main(String[] args) {
		double a = 40.89;
		if(a<50) {
			System.out.println("The value of a is less than 50");
			if(a==40.89) {
				System.out.println("The value of a is equal to 40.89");	
				if (a>800) {
					System.out.println("The value of a is grater than 800");
					
				}
			}
				
		}else {
			System.out.println("all the above specified conditions are false");
		}

	}

}
