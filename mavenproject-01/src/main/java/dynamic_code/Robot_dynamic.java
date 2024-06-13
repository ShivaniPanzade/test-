package dynamic_code;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robot_dynamic {
	
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");

	public static void open_Browser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		}
		System.out.println("The browser launch is : " + browser);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public static void sendurl(String url) {
		driver.get(url);
		System.out.println("Title is : " + driver.getTitle());
	}
	
    public static void upload_file(String locator,String path) throws Throwable {
    driver.findElement(By.xpath(locator)).click();
    
    StringSelection ss=new StringSelection(path);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    
    Robot r = new Robot();
    
    r.delay(2000);
	r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_V);
    
    r.delay(2000);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    
    
    }}  



	
		
	