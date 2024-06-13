package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Action_class extends Base_class {

	public static void main(String[] args) {
		open_Browser("chrome");
		sendurl("https://www.flipkart.com/");
		
		Actions act=new Actions(driver);
		
		WebElement electronics = driver.findElement(By.xpath("(//img[@class=\"_2puWtW _3a3qyb\"])[4]"));
		act.moveToElement(electronics).perform();
		
		WebElement two_wheelers = driver.findElement(By.xpath("//div[@aria-label=\"Two Wheelers\"]"));
		act.moveToElement(two_wheelers).perform();
		
		WebElement mobiles = driver.findElement(By.xpath("(//img[@class=\"_2puWtW _3a3qyb\"])[2]"));
		act.moveToElement(mobiles).contextClick().build().perform();
		
		WebElement search = driver.findElement(By.cssSelector("input.Pke_EE"));
		act.moveToElement(search).click().sendKeys("kurti").doubleClick().build().perform();
		
		driver.close();
	}

}
