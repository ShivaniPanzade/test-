package array;

public class Two_dimenshional {

	public static void main(String[] args) {
		//by allocating memory
		
		int [][]serial_no=new int [4][5];
		serial_no[0][0]=9;
		serial_no[0][1]=7;
		serial_no[0][2]=8;
		serial_no[0][3]=6;
		serial_no[0][4]=5;
		
		serial_no[1][0]=0;
		serial_no[1][1]=2;
		serial_no[1][2]=1;
		serial_no[1][3]=3;
		serial_no[1][4]=4;
		
		serial_no[2][0]=5;
		serial_no[2][1]=6;
		serial_no[2][2]=7;
		serial_no[2][3]=8;
		serial_no[2][4]=9;
		
		serial_no[3][0]=9;
		serial_no[3][1]=7;
		serial_no[3][2]=6;
		serial_no[3][3]=4;
		serial_no[3][4]=2;
		
		for(int u=0; u<4; u++) {
			for(int h=0; h<5; h++) {
				System.out.print(serial_no[u][h]+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------");
		System.out.println("The index value is :"+serial_no[3][4]);
		System.out.println("-------------------------------------------------");
		
		//without allocating memory
		
		int[][]values= {{3,4,2,6} ,{1,6,8,9},{2,6,1,0},{0,7,5,4}};
		 for(int c=0; c<4; c++) {
			 for(int t=0; t<4; t++) {
				 System.out.print(values[c][t]+" ");
			 }
			 System.out.println();
		 }
		
		
	}

}
