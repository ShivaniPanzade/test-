package basic_ConceptsOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// driver.get("https://www.railyatri.in");
		// driver.get("https://www.amazon.in/");
		// driver.get("https://www.flipkart.com/");
		 //driver.get("https://www.myntra.com/");
		// driver.get("https://snapdeal.com/");
		// driver.get("https://www.linkedin.com/");
		// driver.get("https://www.makemytrip.com/");
		// driver.get("https://www.goibibo.com/");
		// driver.get("https://www.redbus.in/");
		// driver.get("https://www.netmeds.com/");
		// driver.get("https://www.shaadi.com/");
		// driver.get("https://www.jeevansathi.com/");
		// driver.get("https://www.globalsqa.com/");
		// driver.get("https://vinothqaacademy.com/");

		// id
		// flipkart
		driver.findElement(By.id("seo--footer"));
		driver.findElement(By.id("jsonLD"));

		// name
		driver.findElement(By.name("theme-color"));
		driver.findElement(By.name("Keywords"));

		// classname
		// snapdeal
		driver.findElement(By.className("sidebarin-content"));
		driver.findElement(By.className("sidebarin-heading"));

		// linktext
		// myntra
		driver.findElement(By.linkText(" USEFUL LINKS "));
		driver.findElement(By.linkText("Justice League"));

		// partiallinkedtext
		// myntra
		driver.findElement(By.partialLinkText("USEFUL L"));
		driver.findElement(By.partialLinkText("Justice L"));

		// tagname
		driver.findElements(By.tagName("script"));
		driver.findElements(By.tagName("div"));

		// css

		// tagname#idvalue
		driver.findElement(By.cssSelector("style#react-native-stylesheet"));
		driver.findElement(By.cssSelector("div#portal--container"));

		// tagname.classvalue
		// snapdeal
		driver.findElement(By.cssSelector("div.sidebaroverlay"));
		driver.findElement(By.cssSelector("div.sidebarin"));

		// tagname[attribute="valueofattribute"]
		driver.findElement(By.cssSelector("link[rel=\"icon\"]"));
		driver.findElement(By.cssSelector("meta[name=\"viewport\"]"));

		// multiple attributes
		// tagname[attribute1="valueofattribute1"][attribute2="valueofattribute2"]
		driver.findElement(By.cssSelector(
				"meta[name=\"viewport\"][content=\"width=device-width,minimum-scale=1,user-scalable=no\"]"));
		driver.findElement(By.cssSelector("meta[http-equiv=\"origin-trial\"][data-feature=\"Web Share\"]"));

		// contains
		// tagname[attribute*="value of attribute"]
		driver.findElement(By.cssSelector("meta[name*=\"Description\"]"));
		driver.findElement(By.cssSelector("link[rel*=\"canonical\"]"));

		// startswith
		// tagname[attribute^="valueofattribute"]
		driver.findElement(By.cssSelector("style[id^=\"react-native-stylesheet\"]"));
		driver.findElement(By.cssSelector("link[href^=\"https://rukminim2.flixcart.com\"]"));

		// endswith
		// tagname[attribute$="valueofattribute"]
		driver.findElement(By.cssSelector("div[id$=\"toast-ctn\"]"));
		driver.findElement(By.cssSelector("script[id$=\"__LOADABLE_REQUIRED_CHUNKS__\"]"));

		// pseudoclass
		// amzaon
		// first child
		// tagname[attribute="valueofattribute"] :first-child
		driver.findElement(By.cssSelector("select[name=\"url\"] :first-child"));
		driver.findElement(By.cssSelector("select[title=\"Search in\"] :first-child"));

		// last child
		// tagname[attribute="valueofattribute"] :last-child
		driver.findElement(By.cssSelector("select[title=\"Search in\"] :last-child"));
		driver.findElement(By.cssSelector("select[w=\"display: block; top: 2.5px;\"] :last-child"));

		// nth child
		// tagname[attribute="valueofattribute"] :nth-child(n)
		driver.findElement(By.cssSelector("select[w=\"display: block; top: 2.5px;\"] :nth-child(5)"));
		driver.findElement(By.cssSelector("select[name=\"url\"] :nth-child(7)"));

		// nth last child
		// tagname[attribute="valueofattribute"] :nth-last-child(n)
		driver.findElement(By.cssSelector("select[name=\"url\"] :nth-last-child(16)"));
		driver.findElement(By.cssSelector("select[tabindex=\"0\"] :nth-last-child(10)"));

		// Xpath

		// absolute xpath
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[4]"));
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span"));

		// relative xpath
		// //tagname[@attribute="valueofattribute"]
		driver.findElement(By.xpath("//style[@class=\"vjs-styles-defaults\"]"));
		driver.findElement(By.xpath("//style[@class=\"vjs-styles-dimensions\"]"));

		// tagname and multiple attribute
		// myntra
		// //tagname[@attribute="valueofattribute"][@attribute="valueofattribute"]
		driver.findElement(By.xpath(
				"//script[@type=\"text/javascript\"][@src=\"https://www.google-analytics.com/plugins/ua/ec.js\"]"));
		driver.findElement(By.xpath(
				"//script[@type=\"text/javascript\"][@src=\"https://tags.creativecdn.com/puHg1KcJ065mNy8GCJ8G.js\"]"));

		// and operator
		// //tagname[@attribute="valueofattribute" and @attribute="valueofattribute"]
		driver.findElement(By.xpath("//meta[@name=\"twitter:app:name:googleplay\"and@content=\"Myntra\"]"));
		driver.findElement(By.xpath("//meta[@name=\"twitter:app:id:iphone\" and @content=\"907394059\"]"));

		// or operator
		// //tagname[@attribute="valueofattribute" or @attribute="valueofattribute"]
		driver.findElement(By.xpath(
				"//link[@rel=\"apple-touch-icon\"or href=\"https://constant.myntassets.com/pwa/assets/img/Icon-App-60x60@3x_2021.png\"]"));
		driver.findElement(By.xpath("//meta[@property=\"fb:admins\"or content=\"520074227\"]"));

		// contains
		// //tagname[contains(@attribute,'valueofattribute')]
		driver.findElement(By.xpath("//meta[contains(@name,\"twitter:title\")]"));
		driver.findElement(By.xpath("//meta[contains(@name,\"twitter:app:name:iphone\")]"));

		// startswith
		// //tagname[starts-with(@attribute,'valueofattribute')]
		driver.findElement(By.xpath("//meta[starts-with(@name,\"twitter:i\")]"));
		driver.findElement(By.xpath("//meta[starts-with(@property,\"og:ty\")]"));

		// text
		// (//tagname[text()="value"])[index value]
		driver.findElement(By.xpath("(//a[text() =\"Women\"])[1]"));
		driver.findElement(By.xpath("(//a[text()=\"Beauty\"])[2]"));

		// parent and child relationship
		// parent tagname[@ parent attribute="valueofattribute"]
		// child tagname[@child attribute="valueofattribute"]
		driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]//a[@data-group=\"men\"]"));
		driver.findElement(By.xpath("//div[@data-reactid=\"179\"]//a[@data-group=\"women\"]"));

		// select current node
		// child tagname[@attribute="valueofattribute"]//self:child tagname
		driver.findElement(By.xpath("(//button[@data-role=\"none\"]//self::button)[2]"));
		driver.findElement(By.xpath("(//h4[@class=\"text-banner-title\"]//self::h4)[1]"));

		// select parent of current node
		// child tagname[@attribute="valueofattribute"]//parent:parent tagname
		driver.findElement(By.xpath("(//h4[@class=\"text-banner-title\"]//parent::div)[2]"));
		driver.findElement(By.xpath("(//button[@type=\"button\"]//parent::div)[2]"));

		// select child of current node
		// child tagname[@attribute="valueofattribute"]//child:child tagname
		driver.findElement(By.xpath("//p[@data-reactid=\"7\"]//child::a"));
		driver.findElement(By.xpath("//div[@data-reactid=\"56\"]//child::p"));
	}
}
