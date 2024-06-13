package Mock;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Come {

	public static void main(String[] args) {
		Date r=new Date();
		System.out.println(r.toString());
		
		SimpleDateFormat t=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(t.format(r));
		
	}

}
