package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Loading a url
		driver.get("http://leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		WebElement drag = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 100, 50).perform();
		
		
	}

}
