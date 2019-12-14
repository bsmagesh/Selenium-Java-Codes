package week3.assignment;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QueryTrainName {
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
			   List<WebElement> trainNo = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[1]");
			   List<WebElement> trainName = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
			   Map<String,String> trainDetails=new LinkedHashMap<>();
			   for (int i = 0; i < trainNo.size(); i++) {
				   trainDetails.put(trainNo.get(i).getText(), trainName.get(i).getText());  
			} 
			   System.out.println(trainDetails.get("22625"));
		}
}
