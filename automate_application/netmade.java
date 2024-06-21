package automate_application;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dynamic_code.Base_class;

public class netmade extends Base_class {

	@BeforeSuite
	public void launch_browser() throws Throwable  {
		open_Browser("chrome");
		
	}

	@BeforeTest
	public void send_url() throws Throwable {
		sendurl("https://www.netmeds.com/");
		
	}

	@Test(priority = 1)
	public void deliver_to() throws Throwable {
		WebElement deliver_to = driver.findElement(By.xpath("//span[@id=\"delivery_details\"]"));
		deliver_to.click();
		System.out.println("Exsisting pincode is : " + deliver_to.getText());
	        Thread.sleep(3000);

		

		WebElement pincode = driver.findElement(By.xpath("//input[@id=\"rel_pincode\"]"));
		pincode.sendKeys("444705");
		System.out.println("Entered pincode is : " + pincode.getAttribute("value"));
		Thread.sleep(2000);
		
	}

	@Test(priority = 2)
	public void search() throws Throwable {
		WebElement search = driver.findElement(By.xpath("//input[@id=\"search\"]"));
		search.sendKeys("chestoncold");
		Thread.sleep(2000);
		System.out.println("Entered text is : " + search.getAttribute("value"));
		

		Actions act = new Actions(driver);
		act.keyDown(Keys.ENTER).build().perform();
	}

	@Test(priority = 3)
	public void scroll()  {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println(driver.getTitle());
		
	}

	@Test(priority = 4)
	public void click_cart() throws Throwable {
		driver.findElement(By.xpath("(//button[@title=\"ADD TO CART\"])[1]")).click();
		Thread.sleep(2000);
		
	}

	@Test(priority = 5)
	public void cart()  {
		WebElement cart = driver.findElement(By.xpath("//div[@class=\"text\"]"));

		Actions act = new Actions(driver);
		act.moveToElement(cart).click().build().perform();
		

	}

	@Test(priority = 6)
	public void Quantity() throws Throwable {
		WebElement quantity = driver.findElement(By.xpath("//select[@name='quantity']"));
		Select select = new Select(quantity);
		select.selectByVisibleText("5");
		System.out.println("Selected quantity is : " + quantity.getAttribute("value"));
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void scroll2()  {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		System.out.println(driver.getTitle());
		
	}
	@Test(priority = 8)
	public void proceed() {
		driver.findElement(By.xpath("//button[@class=\"btn-checkout btn btn_to_checkout ng-star-inserted\"]")).click();
	}
	@Test(priority=9)
	public void mob_no() {
		driver.findElement(By.xpath("//input[@id=\"loginfirst_mobileno\"]")).sendKeys("9763417653");
	}	
	        @AfterSuite
		public void close() {
	         driver.close();
		
		
		}
}
