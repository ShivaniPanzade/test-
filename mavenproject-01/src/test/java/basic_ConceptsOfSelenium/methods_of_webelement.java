package basic_ConceptsOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods_of_webelement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://snapdeal.com/");

		WebElement searchbox = driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
		System.out.println("The value of id attribute is : " + searchbox.getAttribute("id"));
		searchbox.click();
		searchbox.sendKeys("women's wear");

		WebElement search = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']"));
		System.out.println("The search button is enabled on UI : " + search.isEnabled());
		search.click();

		WebElement topwear = driver.findElement(By.xpath("(//div[@class=\"sub-cat-name \"]//self::div)[2]"));
		System.out.println("Text is : " + topwear.getText());
		topwear.click();

		
		WebElement sort = driver.findElement(By.xpath("//div[@class='sort-selected']"));
		System.out.println("Value of attribute is : " + sort.getAttribute("value"));
		sort.click();
		Thread.sleep(5000);

		WebElement discount = driver.findElement(By.xpath("(//li[@class=\"search-li\"])[4]"));
		System.out.println("Discount offer selected or not :" + discount.isSelected());
		discount.click();

		WebElement logo = driver.findElement(By.xpath("//input[@class=\"col-xs-20 searchformInput keyword\"]"));
		System.out.println("x coordinate of logo is:" + logo.getLocation().x);
		System.out.println("y coordinate of logo is:" + logo.getLocation().y);

		WebElement pincode = driver.findElement(By.xpath("//input[@class=\"sd-input\"]"));
		System.out.println("Size of input bar is :" + pincode.getSize());
		System.out.println("Tagname is :" + pincode.getTagName());
		pincode.click();
		Thread.sleep(5000);
		pincode.sendKeys("444705");

		WebElement button = driver.findElement(By.xpath("//button[@class='pincode-check']"));
		button.click();

		WebElement display = driver.findElement(By.xpath("(//span[text()=\"Men's Fashion\"])[1]"));
		System.out.println("Mens fashion icon displayed on UI:" + display.isDisplayed());

		Thread.sleep(5000);
		driver.navigate().refresh();

		Thread.sleep(4000);
		driver.navigate().back();

		Thread.sleep(3000);
		driver.navigate().forward();

		Thread.sleep(2000);
		driver.close();

	}

}
