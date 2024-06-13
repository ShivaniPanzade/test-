package dynamic_code;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Report {
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	public static ExtentReports er;
	public static ExtentTest test;

	public static void reports(String doctitle, String reportname, String app) {
		ExtentSparkReporter esr = new ExtentSparkReporter(projectpath + "\\report");
		esr.config().setDocumentTitle(doctitle);
		esr.config().setReportName(reportname);
		esr.config().setTheme(Theme.STANDARD);

		er = new ExtentReports();
		er.attachReporter(esr);

		er.setSystemInfo("AUTOMATION", "Stp infotech");
		er.setSystemInfo("Testing", "Automation");
		er.setSystemInfo("OS", "Windows 11");
		er.setSystemInfo("Browser", "Chrome");
		er.setSystemInfo("Domain", "ecommerce");
		er.setSystemInfo("Application", app);
		er.setSystemInfo("software test engineer", "Shivani");

	}

	public static void Test(String Testname, String Testinfo) {
		test = er.createTest(Testname);
		test.log(Status.INFO, Testinfo);

	}

	public static void addscreencapture(String Screenshotname) {
		test.addScreenCaptureFromPath(projectpath + "\\report_sc\\" + Screenshotname + ".png");
	}

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
		File target = new File("./Makemytrip_screenshot./" + screenshot_name + ".png");
		FileHandler.copy(source, target);

	}

	public static void screenshot(String screenshot_name) throws Throwable {
		TakesScreenshot ss1 = (TakesScreenshot) driver;
		File source1 = ss1.getScreenshotAs(OutputType.FILE);
		File target1 = new File(projectpath + "\\window_handles ss\\" + screenshot_name + ".png");
		FileHandler.copy(source1, target1);
	}

}
