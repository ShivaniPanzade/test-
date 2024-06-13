package nested_loop;

public class Floyds_triangle {

	public static void main(String[] args) {
		
		
		int m=1;
		for(int a=1;a<=6;a++) {
		for(int b=1; b<=a; b++)	{
			System.out.print(m+" ");
			m++;
		}
		
		System.out.println();
		}
	}
}