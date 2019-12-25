package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//Loading a url
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobiles");
		driver.findElementByClassName("nav-input").click();
		System.out.println("Price is "+driver.findElementByXPath("//span[@class=\"a-price-whole\"]").getText());
		driver.findElementByXPath("//img[@class=\"s-image\"]").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listOfBrowsers=new ArrayList<String>(windowHandles);
		driver.switchTo().window(listOfBrowsers.get(1));
		String text = driver.findElementById("acrCustomerReviewText").getText();
		String num=text.replaceAll("[^0-9]","");
		System.out.println("Number of rating is "+num);
		driver.findElementById("add-to-cart-button").click();
		String text2 = driver.findElementByXPath("//h1[@class=\"a-size-medium a-text-bold\"]").getText();
		if (text2.contains("Added to Cart")) {
			System.out.println("Text is displayed");
		}
		else {
			System.out.println("Text not displayed");
		}
		driver.findElementById("hlb-ptc-btn-native").click();
		if (driver.getTitle().contains("Amazon Sign In")) {
			System.out.println("Correct title");
		} else {
			System.out.println("In-correct title");
		}
		driver.findElementById("continue").click();
		String message = driver.findElementByXPath("(//div[@class=\"a-alert-content\"])[2]").getText();
		if (message.contains("Enter your email or mobile phone number")) {
			System.out.println("Error message displayed");
		} else {
			System.out.println("Error message not displayed");
		}
		driver.quit();
	}
}
