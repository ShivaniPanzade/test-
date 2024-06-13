package dynamic_code;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_class {
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

	public static void takesScreenshot(String screenshot_name) throws Throwable {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File target = new File("./Makemytrip_screenshot./"+ screenshot_name+ ".png");
		FileHandler.copy(source, target);

	}

	public static void screenshot(String screenshot_name) throws Throwable {
		TakesScreenshot ss1 = (TakesScreenshot) driver;
		File source1 = ss1.getScreenshotAs(OutputType.FILE);
		File target1 = new File(projectpath + "\\window_handles ss\\" + screenshot_name + ".png");
		FileHandler.copy(source1, target1);
	}
}
