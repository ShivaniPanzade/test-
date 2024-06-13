package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Slider extends Base_class{

	public static void main(String[] args) throws Throwable {
		open_Browser("chrome");
		sendurl("https://jqueryui.com/slider/");
		
		Actions act=new Actions(driver);
		
		WebElement slider_frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(slider_frame);
		
		WebElement box = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));
		
		act.dragAndDropBy(box, 400, 0).build().perform();
		Thread.sleep(2000);
		
		act.moveToElement(box).clickAndHold().moveByOffset(300, 0).release().build().perform();
		
		Thread.sleep(3000);
		act.clickAndHold().moveByOffset(-500, 0).release(box).build().perform();
		
		driver.close();
	}

}
