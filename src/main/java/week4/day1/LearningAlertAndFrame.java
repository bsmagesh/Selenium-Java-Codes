package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAlertAndFrame {

	public static void main(String[] args) {	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		    //Loading a url
		    driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		    driver.manage().window().maximize();
		    driver.switchTo().frame("iframeResult");
		    driver.findElementByXPath("//button[text()='Try it']").click();
		    Alert alert = driver.switchTo().alert();
		    alert.sendKeys("Magesh");
		    alert.accept();
		    String text = driver.findElementById("demo").getText();
		    if (text.contains("Magesh")) {
				System.out.println("Success");
			} else {
System.out.println("Failure");
			}
	}

}
