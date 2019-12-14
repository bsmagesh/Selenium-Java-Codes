package week3.day2.classroom1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListLearning {
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
		    List<String> newList=new ArrayList<>();
		    List<WebElement> eletable = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
for (WebElement trainName : eletable) {
	newList.add(trainName.getText());
}
Collections.sort(newList);
for (int i = 0; i < newList.size(); i++) {
	if (newList.get(i).equals(newList.get(i+1))) {
		System.out.println("Duplicate exists");
		break;
	}
}
}
}
