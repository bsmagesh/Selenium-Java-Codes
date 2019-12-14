package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Loading a url
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item1)
		.keyUp(Keys.CONTROL).perform();


	}

}
