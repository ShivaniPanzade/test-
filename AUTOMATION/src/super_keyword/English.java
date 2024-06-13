package super_keyword;

public class English extends Maths {
	String h="Physics";
	
	public void relation() {
		System.out.println(this.h);
		System.out.println(super.h);
		super.relation();
	}

	

	public static void main(String[] args) {
		English n=new English();
		n.relation();
		

	}

}
