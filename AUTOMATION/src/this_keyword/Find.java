package this_keyword;

public class Find extends Subject{
	
	int j=89;
	static float v=12.6f;
	String k="Computer";
	
	public void come() {
		System.out.println(this.j);
		System.out.println(this.k);
		System.out.println(this.v);
		System.out.println("come to home");
		
	}
	public void listen() {
		this.come();
		this.function();
		System.out.println(this.d);
		System.out.println("listen the poem");
	}

	public static void main(String[] args) {
		Find f=new Find();
		f.listen();

	}

}
