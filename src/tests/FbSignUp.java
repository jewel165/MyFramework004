package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Config04;
import locators.FbLocators01;
import util.WebDriverAPI02;
import values.FbValues01;

public class FbSignUp extends Config04 {
	
	WebDriverAPI02 cc = new WebDriverAPI02();
	FbLocators01 dd = new FbLocators01();
	FbValues01 ee = new FbValues01();

	
	@Test(groups="Smoke")
	public void Signup() {
		
		TypeByXpath(dd.Frname, ee.Fname);
		TypeByXpath(dd.Lrname,ee.Lname);
		TypeByXpath(dd.sn_email,ee.Email);
		TypeByXpath(dd.sn_pass,ee.Pass);
		
		//selectMonth(ee.Mn_october);
		
		WebElement wb1 = driver.findElement(By.id("month"));
		Select s1 =new Select(wb1);
		s1.selectByValue("10");
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
}

