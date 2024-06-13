package switch_statement;

public class Switch_combination {

	public static void main(String[] args) {
	int day_no = 5;
	String day;
	
	switch (day_no) {
	
	case 1:
		day = "Sunday";
		break;
	case 2:
		day = "Monday";
		break;
	case 3:
		day = "Tuesday";
		break;
	case 4:
		day = "Wednesday";
		break;
	case 5:
		day = "Thursday";
		break;
	case 6:
		day = "Friday";
		break;
	
	case 7:
		day = "Saturday";
		break;
	default:
		day = "Invalid day";
		break;
		
	}
      System.out.println("Your day is : " + day);
	}

}
