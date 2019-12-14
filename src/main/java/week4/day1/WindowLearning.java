package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowLearning {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		    //Loading a url
		    driver.get("http://leafground.com/pages/Window.html");
		    driver.manage().window().maximize();
		    driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
Set<String> windowHandles = driver.getWindowHandles();
int size = windowHandles.size();
System.out.println(size);
List<String> listOfBrowsers=new ArrayList<String>(windowHandles);
driver.switchTo().window(listOfBrowsers.get(size-1));
System.out.println(driver.getTitle());
driver.quit();
	}


}
