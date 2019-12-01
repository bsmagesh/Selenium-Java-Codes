package day3.classroom;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		// Initiate the ChromeBroswer
driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the browser
driver.manage().window().maximize();
		// Enter the UserName
driver.findElementById("username").sendKeys("demosalesmanager");
		// Enter the Password
driver.findElementById("password").sendKeys("crmsfa");
		// Click on Login Button
driver.findElementByClassName("decorativeSubmit").click();
		// Click on crm/sfa button
driver.findElementByLinkText("CRM/SFA").click();
		// Click on Leads
driver.findElementByLinkText("Leads").click();
		// Click on Create Lead button
driver.findElementByLinkText("Create Lead").click();
		// Enter Company Name
driver.findElementById("createLeadForm_companyName").sendKeys("Test11130");
		// Enter First Name
driver.findElementById("createLeadForm_firstName").sendKeys("TestFirstName");
		// Enter Last Name
driver.findElementById("createLeadForm_lastName").sendKeys("TestlastName");
		// Click on Create Lead (Submit) button
driver.findElementByClassName("smallSubmit").click();
		// Verify the Lead is created by checking the Company or First Name
String text = driver.findElementById("viewLead_firstName_sp").getText();
	if (text.contentEquals("TestFirstName")) {
		System.out.println("Sucesfully created");
	}
	else {
		System.out.println("Failure");
	}

	}

}
