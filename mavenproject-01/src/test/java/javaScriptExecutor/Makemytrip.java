package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Makemytrip extends Base_class {

	public static void main(String[] args) throws Throwable {

		open_Browser("chrome");
		takesScreenshot("launch browser");

		sendurl("https://www.makemytrip.com/");
		takesScreenshot("send url");

		driver.findElement(By.xpath("//li[@class=\"active\"]")).click();
		Thread.sleep(3000);
		screenshot("profile");

		driver.findElement(By.xpath("//i[@data-cy='MobileCodeDropDown_60']")).click();
		screenshot("dropdown bar");

		driver.findElement(By.xpath("(//div[@class=\"li makeFlex hrtlCenter font12\"])[3]")).click();
		screenshot("select country");

		WebElement mobno = driver.findElement(By.xpath("//input[@class=\"font14 fullWidth\"]"));
		mobno.click();
		mobno.sendKeys("8583475757");
		Thread.sleep(2000);
		takesScreenshot("enter mobno");

		driver.findElement(By.cssSelector("input#user-consent-checkbox")).click();
		Thread.sleep(3000);
		takesScreenshot("select checkbox");

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span.commonModal__close")).click();
		screenshot("close page");

		JavascriptExecutor java = (JavascriptExecutor) driver;
		java.executeScript("window.scrollBy(0,1200)");
		screenshot("pagescroll");
		Thread.sleep(2000);

		java.executeScript("window.scrollBy(0,-800)");
		screenshot("pagescroll_up");
		Thread.sleep(3000);

		java.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		screenshot("scroll_bottom");
		Thread.sleep(2000);

		java.executeScript("window.history.go(0)");
		takesScreenshot("refresh_window");
		Thread.sleep(2000);

		java.executeScript("window.history.back()");
		takesScreenshot("back_to_browser");
		Thread.sleep(2000);

		java.executeScript("window.history.forward()");
		takesScreenshot("forward_to_window");
		Thread.sleep(2000);

		driver.close();

	}

}
