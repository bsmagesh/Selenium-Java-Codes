package week4.day2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		    //Loading a url
		    driver.get("https://acme-test.uipath.com/account/login");
		    driver.manage().window().maximize();
driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
driver.findElementById("password").sendKeys("leaf@12");
driver.findElementById("buttonLogin").click();
Actions obj=new Actions(driver);
WebElement vendor = driver.findElementByXPath("(//button[contains(@class,\"btn-default\")])[5]");
//WebElement searchVendor = driver.findElementByXPath("//a[text()=Search for Vendor]");
obj.moveToElement(vendor).perform();
obj.click(driver.findElementByXPath("//a[text()=\"Search for Vendor\"]")).perform();
driver.findElementById("vendorName").sendKeys("Blue Lagoon");
driver.findElementById("buttonSearch").click();
System.out.println(driver.findElementByXPath("//table[@class=\"table\"]//td[5]").getText());
driver.findElementByLinkText("Log Out");
driver.close();
	}

}
