package report;

import javax.net.ssl.ExtendedSSLSession;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_code.Base_class;

public class Reports extends Base_class
{

	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		ExtentSparkReporter ex=new ExtentSparkReporter(projectpath +"\\Report\\main_report");
		ex.config().setDocumentTitle("document");
		ex.config().setDocumentTitle("report_name");
		ex.config().setTheme(Theme.STANDARD);
		
		ExtentReports er=new ExtentReports();
		er.attachReporter(ex);
		
		er.setSystemInfo("operating system", "windows");
		er.setSystemInfo("browser", "chrome");
     	er.setSystemInfo("test eng", "shivani");
		er.setSystemInfo("website", "amazon");
		
		ExtentTest et=er.createTest("search_amazon");
		
		et.log(Status.INFO,"search_functionality");
		et.log(Status.PASS,"search_functionality_testcase_pass");

		open_Browser("chrome");
		sendurl("https://www.amazon.in/");
		
		driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[6]")).click();
		
		er.flush();


		
		
		
	}

}
