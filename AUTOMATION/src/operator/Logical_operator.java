package operator;

public class Logical_operator {

	public static void main(String[] args) {
		//Logical AND
		
		int r=200;
		int j=400;
		int f=400;
		
		//true,false=false
		boolean k=r<j && r>j;
		System.out.println(k);
		
		//false, true=false
		boolean h=r>j && r<j;
		System.out.println(h);
		
		//false false=false
		boolean l=r>j && r<f;
		System.out.println(l);
		
		//true,true=true
		boolean v=r<j && f==j;
		System.out.println(v);
		System.out.println("-------------------------------------------------");
		
		//Logical OR
		
		int a=80;
		int b=100;
		
		//false,true=true
		System.out.println(a>b||a<b);
		
		//true,false=true
		System.out.println(a<b||a>b);
		
		//false,false=false
		System.out.println(a==b||a>=b);
		
		//true,true=true
		System.out.println(a<b||b>a);
		System.out.println("------------------------------------");
		
		//Logical NOT
		
		int o=200;
		System.out.println(!(o<400));
		
		int y=600;
		System.out.println(!(y==800));
	}

}
