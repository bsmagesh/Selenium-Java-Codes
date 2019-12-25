package testNGBaseCode;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5.day2.classroom.LearnExcel;

public class ProjectSpecificMethods {
	public ChromeDriver driver;
	public String excelFileName;
	@BeforeMethod
	@Parameters({"Url","UserID","Pwd"})
public void login(String url,String UID,String Pwd)
{
	// Set the property for ChromeDriver
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver=new ChromeDriver();

				// Initiate the ChromeBroswer
		driver.get(url);
				// Maximize the browser
		driver.manage().window().maximize();
				// Enter the UserName
		driver.findElementById("username").sendKeys(UID);
				// Enter the Password
		driver.findElementById("password").sendKeys(Pwd);
				// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
				// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();
}
	@AfterMethod
	public void close()
	{
		driver.close();
	}

@DataProvider
public String[][] getData() throws IOException
{
	LearnExcel data=new LearnExcel();
	/*String[][] data =new String[2][3];
	data[0][0] = "TestLeaf";
	data[0][1] = "fName1";
	data[0][2] = "SName1";
	data[1][0] = "TestLeaf";
	data[1][1] = "fName2";
	data[1][2] = "SName2";
	return data;*/
	return data.getXLValue(excelFileName);
}
}