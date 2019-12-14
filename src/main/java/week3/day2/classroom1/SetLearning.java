package week3.day2.classroom1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetLearning {
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
		    Set<String> newSet=new LinkedHashSet<>();
		    List<WebElement> eletable = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[1]");
for (WebElement trainName : eletable) {
	newList.add(trainName.getText());
}
for (WebElement trainName1 : eletable) {
	newSet.add(trainName1.getText());
}
if (newList.size()==newSet.size()) {
	System.out.println("Duplicate does not exists");
}
}
}