package set_date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Calendar extends Base_class {

	public static void main(String[] args) throws Throwable {
		open_Browser("chrome");
		sendurl("https://www.railyatri.in/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement calendar = driver.findElement(By.xpath("//input[@id=\"datepicker_train\"]"));
		 calendar.click();
		 
		 //driver.findElement(By.xpath("//td[text()=\"12\"]")).click();
		// System.out.println("Selected date is : "+calendar.getAttribute("value"));
		 
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("(//th[@class=\"next\"])[1]")).click();
		// driver.findElement(By.xpath("//td[text()=\"11\"]")).click();
		// System.out.println("Selected date is : "+calendar.getAttribute("value"));
		 
		 int date=15;
		 while(true) {
			
			 String month_year = driver.findElement(By.xpath("(//th[@class=\"datepicker-switch\"])[1]")).getText();
			 System.out.println("Current month and year is : "+month_year);

			 if(!(month_year.equalsIgnoreCase("August 2024"))) {
				 
				 driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
			}else {
				 break;
			 }
		 }
		    //click on date
		    driver.findElement(By.xpath("//td[text()='"+ date + "']")).click();
		    
			// driver.findElement(By.xpath("//td[text()='13']")).click();
			 System.out.println("Selected date is : "+calendar.getAttribute("value"));
			 
			 
		 }}
	


