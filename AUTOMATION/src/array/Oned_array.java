package array;

public class Oned_array {

	public static void main(String[] args) {
		//by allocating memory
		
		//int datatype
		int []school=new int[4];
		//add the values
		school[0]=25;
		school[1]=78;
		school[2]=80;
		school[3]=90;
		
		//for each
		for(int v : school) {
			System.out.println(v);
		}
		System.out.println("--------------------------------------------------");
		
		//for loop
		for(int c=0; c<4; c++) {
			System.out.println("Value is: "+school[c]);
		}
			System.out.println("-----------------------------------------------------");
			
			System.out.println("Size of array is: "+school.length);
			
			System.out.println("Value at index number 2 is : "+school[3]);
		
		
		System.out.println("----------------------------------------------------");

		//String datatype
		{	String[]subject=new String[4];
		
		subject[0]="Maths";
		subject[1]="english";
		subject[2]="Science";
		subject[3]="Chemistry";
		
		//for each
		for(String e:subject) {
			System.out.println(e);
		}
		System.out.println("--------------------------------------");
		
		//for loop
		for(int d=0; d<subject.length; d++) {
			System.out.println(subject[d]);
		}
	}

	}}
