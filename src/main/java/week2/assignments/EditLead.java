package week2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	    //Loading a url
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    //Username
	    driver.findElementById("username").sendKeys("demosalesmanager");
	    //password
	    driver.findElementById("password").sendKeys("crmsfa");
	    //click Login button
	    driver.findElementByClassName("decorativeSubmit").click();
	    driver.findElementByLinkText("CRM/SFA").click();
	    driver.findElementByLinkText("Leads").click();
	    driver.findElementByLinkText("Find Leads").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Assignment");
	    driver.findElementByXPath("//button[text()='Find Leads']").click();
	    WebElement table = driver.findElementByXPath("//table[@class='x-grid3-row-table']");
	    List<WebElement> row = table.findElements(By.tagName("tr"));
	    System.out.println(row.size());
	   List<WebElement> findElements = row.get(1).findElements(By.tagName("td"));
	   System.out.println(findElements.get(1).getText());
}
}
