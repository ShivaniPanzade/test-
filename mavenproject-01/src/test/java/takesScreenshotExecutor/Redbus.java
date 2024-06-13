package takesScreenshotExecutor;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import dynamic_code.Base_class;

public class Redbus extends Base_class {

	public static void main(String[] args) throws Throwable {
		
		open_Browser("chrome");
		
		TakesScreenshot ss=(TakesScreenshot) driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		File target =new File("./Screenshot/redbus_browser.png");
		FileHandler.copy(source, target);
		
		sendurl("https://www.redbus.in/");
		
		TakesScreenshot ss1=(TakesScreenshot) driver;
		File source1=ss1.getScreenshotAs(OutputType.FILE);
		File target1 =new File("./Screenshot/send_url.png");
		FileHandler.copy(source1, target1);
		
		
		//from
		WebElement from = driver.findElement(By.cssSelector("input#src"));
		System.out.println("The value of id attribute is : "+from.getAttribute("id"));
		from.click();
		from.sendKeys("Nagpur");
		
		TakesScreenshot ss2=(TakesScreenshot) driver;
		File source2=ss2.getScreenshotAs(OutputType.FILE);
		File target2 =new File("./Screenshot/from_destination.png");
		FileHandler.copy(source2, target2);
		
		
		//to
		WebElement To = driver.findElement(By.cssSelector("input#dest"));
        To.click();
		To.sendKeys("Mumbai");
		
		TakesScreenshot ss3=(TakesScreenshot) driver;
		File source3=ss3.getScreenshotAs(OutputType.FILE);
		File target3 =new File("./Screenshot/To_destination.png");
		FileHandler.copy(source3, target3);
		
		
		//select mumbai option
		WebElement option = driver.findElement(By.xpath("(//text[@class=\"placeHolderMainText\"])[22]"));
		System.out.println("The option mumbai is selected or not : "+option.isSelected());
		option.click();
		
		TakesScreenshot ss4=(TakesScreenshot) driver;
		File source4=ss4.getScreenshotAs(OutputType.FILE);
		File target4 =new File("./Screenshot/mumbai_option.png");
		FileHandler.copy(source4, target4);
		
		
		//click date
		WebElement date = driver.findElement(By.className("dateText"));
		System.out.println("Tagname is : "+date.getTagName());
		date.click();
		
		
		//select date
        WebElement selectdate = driver.findElement(By.xpath("(//span[@class=\"DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH\"])[1]"));
        System.out.println("Date icon is displayed on UI : "+selectdate.isDisplayed());
        selectdate.click();
        
        TakesScreenshot ss5=(TakesScreenshot) driver;
		File source5=ss5.getScreenshotAs(OutputType.FILE);
		File target5 =new File("./Screenshot/Date_select.png");
		FileHandler.copy(source5, target5);
		
        
        //click search
		 WebElement search = driver.findElement(By.xpath("//button[@tabindex=\"5\"]"));
		 System.out.println("The search button is enabled on UI : "+search.isEnabled());
		 search.click();
		 Thread.sleep(5000);
		 
		    TakesScreenshot ss6=(TakesScreenshot) driver;
			File source6=ss6.getScreenshotAs(OutputType.FILE);
			File target6 =new File("./Screenshot/Search_button.png");
			FileHandler.copy(source6, target6);
			
        
        //click help
        WebElement click = driver.findElement(By.xpath("(//span[@class=\"name_rb_secondary_item\"])[1]"));
        System.out.println("Size of help icon is : "+ click.getSize());
        click.click();
        
        TakesScreenshot ss7=(TakesScreenshot) driver;
		File source7=ss7.getScreenshotAs(OutputType.FILE);
		File target7 =new File("./Screenshot/help_icon.png");
		FileHandler.copy(source7, target7);
		
        
        //logo redbus
        WebElement logo = driver.findElement(By.className("rb_logo"));
        System.out.println("x coordinate of logo is :"+logo.getLocation().x);
        System.out.println("y coordinate of logo is :"+logo.getLocation().y);
        

        Thread.sleep(5000);
        driver.navigate().refresh();
        
        Thread.sleep(6000);
        driver.navigate().back();
        
        Thread.sleep(4000);
        driver.navigate().forward();
        
        Thread.sleep(3000);
        driver.quit();
        
	}    
        
	}

	

	


