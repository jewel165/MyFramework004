package helper;

import org.openqa.selenium.By;
import org.testng.Assert;

import locators.FbLocators01;
import util.WebDriverAPI02;
import values.FbValues01;

public class FbHelper extends WebDriverAPI02 {
	
	
	

	FbLocators01 ab = new FbLocators01();
	FbValues01 bb = new FbValues01();
	
	public void FbLogoTest(String Fblocators) {
		driver.findElement(By.xpath(""));
	}

	public void FbLogin() {
		TypeByXpath(ab.EmailPh,bb.Email);
		TypeByXpath(ab.PassWord,bb.Pass);
		ClickById(ab.LoginBtn);
		
	}
	
	public void LoginVerify() {
	String Greeting = 	driver.findElement(By.xpath(ab.FbGreeting)).getText();
	String actGreeting = Greeting.trim();
	System.out.println(actGreeting);
	Assert.assertEquals(actGreeting, "MD Jewel");
		
	}

}
