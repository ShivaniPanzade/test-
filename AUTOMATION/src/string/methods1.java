package string;

public class methods1 {

	public static void main(String[] args) {
		
		methods1 test = new methods1();
		//is empty
		String a="manual";
		
		System.out.println(a.isEmpty());
		
		String s="";
		System.out.println(s.isEmpty());
		System.out.println("---------------------------------------");
		
		//Length
		System.out.println(a.length());
		System.out.println("---------------------------------------");
		
		//replace
		String d="Mobile";
		System.out.println(d.replace("ile", "k"));
		System.out.println("---------------------------------------");
		
		//index of
		System.out.println(d.indexOf("i"));
		System.out.println(d.indexOf("e"));
		System.out.println("---------------------------------------");
		
		//char at
		System.out.println(d.charAt(3));
		System.out.println("---------------------------------------");
		
		//susbstring
		System.out.println(d.substring(3));
	    System.out.println(a.substring(1, 4));
	    System.out.println("---------------------------------------");
	    
	    //concat
	    System.out.println(d.concat(" testing"));
	    System.out.println(d+" "+ "Testing");
	    System.out.println("---------------------------------------");
	    
	    //lowercase
	    System.out.println(d.toLowerCase());
	    System.out.println("---------------------------------------");
	    
	    //uppercase
	    System.out.println(d.toUpperCase());
	    System.out.println("---------------------------------------");
	    
	    //contains
	    String w="Automation testing is faster in execution";
	    System.out.println(w.contains("testing"));
	    System.out.println(w.contains("Manual"));
	    System.out.println("---------------------------------------");
	    
        //equals
	    String expected="https://www.amazon.in/";
	    String actual="https://www.amazon.com";
	    System.out.println(expected.equals(actual));
	    
	    String expected_1="https://www.amazon.in/";
	    String actual_1="https://www.amazon.in/";
	    System.out.println(expected_1.equals(actual_1) );
	    
	    String i="Automation";
	    String j="Automation";
	    System.out.println(i.equals(j));
	    System.out.println("---------------------------------------");
	    
	    //equalsIgnorecase
	    String k="Automation";
	    String l="automation";
	    System.out.println(k.equals(l));
	    
	  
	    String expected_2="Amazon";
	    String actual_2="amazon";
	    System.out.println(expected_2.equalsIgnoreCase(actual_2) );
	    System.out.println("---------------------------------------");
	    
	   // Endswith
	    String y="Automation testing is faster in execution";
	    System.out.println(y.endsWith("execution"));
	    System.out.println("---------------------------------------");
	    
	    //trim
	    String z= "                     testing                        ";
	    String q= "software";
	    
	    System.out.println(z);
	    System.out.print(z.trim());
	    System.out.print(q);
	    
	    System.out.println("------------------------------------");
	    
	    String r="           functional     testing                   ";
	    System.out.println(r);
	    System.out.println(r.trim());
	    
	}

}
