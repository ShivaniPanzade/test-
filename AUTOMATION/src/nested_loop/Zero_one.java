package nested_loop;

public class Zero_one {

	public static void main(String[] args) {
		
		
		for(int f=1; f<=6; f++) {
			for(int g=1;g<=f; g++) {
				int h=f+g;
				if(h%2==0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}
