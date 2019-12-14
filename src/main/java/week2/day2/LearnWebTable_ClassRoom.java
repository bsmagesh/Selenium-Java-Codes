package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable_ClassRoom {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		    //Loading a url
		    driver.get("https://erail.in/");
		    driver.manage().window().maximize();
		    WebElement elesource = driver.findElementById("txtStationFrom");
		    elesource.clear();
		    elesource.sendKeys("MAS",Keys.TAB);
		    WebElement eledestiny = driver.findElementById("txtStationTo");
		    eledestiny.clear();
		    eledestiny.sendKeys("SBC",Keys.TAB);
		    Thread.sleep(3000);
		    
		    WebElement eletable = driver
		    		.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		    
		    List<WebElement> eleRows = eletable.findElements(By.tagName("tr"));
		   // int size = eleRows.size();
		    List<WebElement> eleCols = eleRows.get(1).findElements(By.tagName("td"));
		    for (int i = 0; i < eleCols.size(); i++) {
				System.out.println(eleCols.get(i).getText());
			}
		    
		    
		    /*driver.findElementByXPath
		    ("//table[@class='DataTable"
		    		+ " TrainList TrainListHeader']"
		    		+ "//tr[4]/td[2]/a").click();*/
		    
		    
		    
	}

}
