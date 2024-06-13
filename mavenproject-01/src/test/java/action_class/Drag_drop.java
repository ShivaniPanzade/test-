package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Drag_drop extends Base_class{

	public static void main(String[] args) {
		
		open_Browser("chrome");
		sendurl("https://jqueryui.com/droppable/");
		
		Actions act=new Actions(driver);
	
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		//act.dragAndDrop(drag, drop).build().perform();
		
		//act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		driver.switchTo().defaultContent();
		
	WebElement draggable = driver.findElement(By.xpath("//a[text()=\"Draggable\"]"));
		act.moveToElement(draggable).click().perform();
		
		driver.close();
	}

}
