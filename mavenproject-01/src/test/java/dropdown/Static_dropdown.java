package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dynamic_code.Base_class;

public class Static_dropdown extends Base_class {

	public static void main(String[] args) throws Throwable {
		
		open_Browser("chrome");
		sendurl("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement products = driver.findElement(By.cssSelector("select#first"));
		products.click();
		
		Select select=new Select(products);
		select.selectByVisibleText("Google");
		
		  WebElement animals = driver.findElement(By.cssSelector("select#animals"));
		  animals.click();
		
		Select select1=new Select(animals);
		select1.selectByVisibleText("Avatar");
		Thread.sleep(2000);
		//select1.deselectByVisibleText("Avatar");
		//select1.selectByVisibleText("Baby Cat");

	}

}
