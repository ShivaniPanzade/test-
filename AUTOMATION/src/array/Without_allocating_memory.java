package array;

public class Without_allocating_memory {

	public static void main(String[] args) {
		//without allocating memory
		//one dimenshional array
		
		float[]percent= {45.78f,78.89f,67.89f,98.90f};
		System.out.println( "Array length is: "+percent.length);
		System.out.println("-------------------------------------");
		
		//for each
		for(float y: percent) {
			System.out.println(y+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------");
		
		//for loop
		for(int v=0;v<percent.length;v++) {
			System.out.println(percent[v]);
			
		}System.out.println("-----------------------------");
		
		//string datatype
		String[]country= {"India","Europe","Pakistan","Thiland"};
		
		//for loop
		for(int k=0; k<country.length;k++) {
			System.out.println(country[k]);
		}
		System.out.println("------------------------------------------");
		
		System.out.println(country.length);
		System.out.println("----------------------------------");
		System.out.println(country[2]);
	}

}
