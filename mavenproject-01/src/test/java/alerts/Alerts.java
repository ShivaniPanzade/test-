package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Alerts extends Base_class{

	public static void main(String[] args) throws Throwable {
		open_Browser("chrome");
		sendurl("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
        Alert simplealert = driver.switchTo().alert();
        System.out.println(simplealert.getText());
        Thread.sleep(2000);
        simplealert.accept();
        
        System.out.println("--------------------------------------------------------");
        
        //confirmation
        driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click();
        driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
        Alert confirmaleart = driver.switchTo().alert();
        System.out.println(confirmaleart.getText());
        Thread.sleep(2000);
        
        //press ok
      //  confirmaleart.accept();
        
        //press cancle
        confirmaleart.dismiss();
        WebElement msg = driver.findElement(By.xpath("//p[@id='demo']"));
        System.out.println(msg.getText());
        
        System.out.println("----------------------------------------------------");
        
        //promt alert
        driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]")).click();
        driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
        Alert promptalert = driver.switchTo().alert();
        System.out.println(promptalert.getText());
        Thread.sleep(2000);
        promptalert.sendKeys("Automation testing");
        promptalert.accept();
        driver.findElement(By.xpath("//p[@id='demo']"));
        System.out.println(msg.getText());
	}

}
