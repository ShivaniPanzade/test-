package exception;

public class try_catch  {

	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("exception handled");
		}
		
		
	}

}
