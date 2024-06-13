package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Dynamic_dropdown extends Base_class {

	public static void main(String[] args) {

		open_Browser("chrome");
		sendurl("https://www.redbus.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		WebElement from = driver.findElement(By.cssSelector("input#src"));
		from.sendKeys("Mum");
		List<WebElement> from1 = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//child::li"));

		for (int a = 0; a <= from1.size(); a++) {

			if (from1.get(a).getText().contains("Mumbai")) {
				from1.get(a).click();

				break;
			}
		}

		//System.out.println("The station name is : " + from.getAttribute("value"));
	
		WebElement To = driver.findElement(By.cssSelector("input#dest"));
		To.sendKeys("Dehl");
		List<WebElement> To1 = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//child::li"));

		for (int b = 0; b <= To1.size(); b++) {

			if (To1.get(b).getText().contains("Dehlawas")) {
				To1.get(b).click();
				
				break;
			}
		}
		
	
		//System.out.println("The station name is : " + To.getAttribute("value"));

	
	}

}
