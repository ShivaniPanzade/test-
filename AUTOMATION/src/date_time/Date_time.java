package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_time {

	public static void main(String[] args) {
		Date e=new Date();
		System.out.println(e.toString());
		System.out.println("-----------------------------------");
		System.out.println();
		
		//customize date
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(f.format(e));
		System.out.println("-----------------------------------");
		System.out.println();
		
		
		SimpleDateFormat g=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(g.format(e));
		System.out.println("-----------------------------------");
		System.out.println();
		
		
		SimpleDateFormat h=new SimpleDateFormat("ss:mm:hh");
		System.out.println(h.format(e));
		
		
		
		
	}

}
