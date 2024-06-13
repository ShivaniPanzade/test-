package window_handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import dynamic_code.Base_class;

public class A_001 extends Base_class {

	public static void main(String[] args) throws Throwable {
		open_Browser("chrome");
		screenshot("launch browser");
		
		sendurl("https://www.naukri.com/");
		screenshot("open url");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		screenshot("scroll to bottom");
        Thread.sleep(2000);
        
		driver.findElement(By.xpath("//a[text()=\"Careers\"]")).click();
		screenshot("click to careers");
		

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> id = windows.iterator();

		String parent_id = id.next();
		System.out.println("The parent id is : " + parent_id);

		String child_id = id.next();
		System.out.println("The child id is : " + child_id);
		
		driver.switchTo().window(child_id);
		System.out.println("transfer to child window");
		screenshot("child window");
		Thread.sleep(2000);
		

		driver.findElement(By.cssSelector("a#about-btn")).click();
		System.out.println("clicked on about");
		screenshot("click about");
		Thread.sleep(2000);
		
		driver.switchTo().window(parent_id);
		System.out.println("back to parent window");
		screenshot("parent window");
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
