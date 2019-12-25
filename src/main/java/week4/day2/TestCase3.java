package week4.day2;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) throws ParseException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//Loading a url
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[@href=\"/chennai/search\"]").click();
		driver.findElementByXPath("//div[@class=\"items\"][2]").click();
		driver.findElementByXPath("//button[@class=\"proceed\"]").click();
		Date date=new Date();
		DateFormat num=new SimpleDateFormat("dd");
		String today=num.format(date);
		int tomorrow=Integer.parseInt(today)+1;
		String stringTomorrow = Integer.toString(tomorrow);
		System.out.println(tomorrow);
		driver.findElementByXPath("//div[text()="+stringTomorrow+"]").click();
		driver.findElementByXPath("//button[@class=\"proceed\"]").click();
		String text = driver.findElementByXPath("//div[@class=\"label time-label\"]").getText();
	    driver.findElementByXPath("//button[text()='Done']").click(); 
	    SimpleDateFormat formatter=new SimpleDateFormat("E dd MMM, yyyy HH:mm");
        Date parse = formatter.parse(text);
        String verifyDate=num.format(parse);
        int selectedDate=Integer.parseInt(verifyDate);
        if (selectedDate==tomorrow) {
        	List<WebElement> priceList = driver.findElementsByXPath("//div[@class=\"price\"]");
        	List<Integer> actualPrice=new ArrayList<>();
        	int listSize = priceList.size();
        	for (int i = 0; i < listSize; i++) {
				String price = priceList.get(i).getText();
				String replaceAll = price.replaceAll("[^0-9]","");
				int sortedPrice=Integer.parseInt(replaceAll);
				actualPrice.add(sortedPrice);
				Collections.sort(actualPrice);
	        	Collections.reverse(actualPrice);
	        	}
        	Integer highestPrice = actualPrice.get(0);
        	String maxPrice = NumberFormat.getInstance().format(highestPrice);
        	//System.out.println(maxPrice);
        	driver.findElementByXPath("//div[contains(text(),'"+maxPrice+"')]//following::button[1]").click();
        	driver.close();
		}
	}

}
