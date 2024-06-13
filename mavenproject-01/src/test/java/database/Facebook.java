package database;

import org.openqa.selenium.By;

import dynamic_code.Database;

public class Facebook extends Database {

	public static void main(String[] args) throws Throwable {
		open_Browser("chrome");
		takesScreenshot("Launched browser");

		sendurl("https://www.facebook.com/");
		takesScreenshot("facebook");

		database_connection("student", "select username,password from facebook where sr_no=3;");
		database_column("username", "//input[@id='email']");
		takesScreenshot("username enter");

		database_column("password", "//input[@id='pass']");
		takesScreenshot("password");

		driver.findElement(By.xpath("//div[@class='_9lsa']")).click();
		takesScreenshot("visible password");
		Thread.sleep(3000);

		driver.close();

	}

}
