package week5.day1.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testNGBaseCode.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {
	@Test(dataProvider="getData")
public void createLead(String cName,String fName, String lName)
{
	
			// Click on Leads
	driver.findElementByLinkText("Leads").click();
			// Click on Create Lead button
	driver.findElementByLinkText("Create Lead").click();
			// Enter Company Name
	driver.findElementById("createLeadForm_companyName").sendKeys(cName);
			// Enter First Name
	driver.findElementById("createLeadForm_firstName").sendKeys(fName);
			// Enter Last Name
	driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	driver.findElementById("createLeadForm_firstNameLocal").sendKeys("TestFirstNameLocal");
	driver.findElementById("createLeadForm_lastNameLocal").sendKeys("TestLastNameLocal");
	driver.findElementById("createLeadForm_personalTitle").sendKeys("TestSalutation");
	driver.findElementById("createLeadForm_generalProfTitle").sendKeys("TestProfile");
	driver.findElementById("createLeadForm_annualRevenue").sendKeys("1000000");
	driver.findElementById("createLeadForm_sicCode").sendKeys("TestSICCode");
	driver.findElementById("createLeadForm_description").sendKeys("TestDescription");
	driver.findElementById("createLeadForm_importantNote").sendKeys("TestImportantNote");
	driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
	driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("123");
	driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("1234");
	driver.findElementById("createLeadForm_departmentName").sendKeys("TestDepartmentName");
	driver.findElementById("createLeadForm_numberEmployees").sendKeys("45");
	driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Test");
	driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("TestPersonToAskFor");
	driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.test.com");
	driver.findElementById("createLeadForm_generalToName").sendKeys("TestToName");
	driver.findElementById("createLeadForm_generalAddress1").sendKeys("TestAddress1");
	driver.findElementById("createLeadForm_generalAddress2").sendKeys("TestAddress2");
	driver.findElementById("createLeadForm_generalCity").sendKeys("TestCity");
	driver.findElementById("createLeadForm_generalPostalCode").sendKeys("30010");
	driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("1234");
	driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567890");
	driver.findElementById("createLeadForm_primaryEmail").sendKeys("123@test.com");
	WebElement sourceDropdown = driver.findElementById("createLeadForm_dataSourceId");
	Select sourceValue=new Select(sourceDropdown);
	sourceValue.selectByIndex(2);
	Select industryValue=new Select(driver.findElementById("createLeadForm_industryEnumId"));
	industryValue.selectByIndex(3);
	Select ownershipValue = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
	ownershipValue.selectByValue("OWN_PARTNERSHIP");
	Select preferredCurrencyValue = new Select(driver.findElementById("createLeadForm_currencyUomId"));
	preferredCurrencyValue.selectByIndex(4);
	Select stateProvinceValue = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
	stateProvinceValue.selectByIndex(4);
	Select countryValue = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
	countryValue.selectByIndex(3);
	Select marketingCampaignValue = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
	marketingCampaignValue.selectByIndex(2);
			// Click on Create Lead (Submit) button
	driver.findElementByXPath("//input[@class=\"smallSubmit\"]").click();
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
