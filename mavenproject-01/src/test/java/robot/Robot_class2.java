package robot;

import dynamic_code.Robot_dynamic;

public class Robot_class2 extends Robot_dynamic{

	public static void main(String[] args) throws Throwable {
		 
		open_Browser("chrome");
		sendurl("https://www.ilovepdf.com/pdf_to_word");
		
        upload_file("//a[@id=\"pickfiles\"]","\"C:\\Users\\shiva\\Downloads\\emailnew.pdf\""); 
		
	}

}
