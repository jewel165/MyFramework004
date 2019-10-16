package tests;

import org.testng.annotations.Test;

import base.Config04;
import helper.FbHelper;
import locators.FbLocators01;
import values.FbValues01;

public class FbSignIn extends Config04{
	
	FbLocators01 aa = new FbLocators01();
	FbValues01 bb = new FbValues01();
	FbHelper cc = new FbHelper();
	
	@Test(groups= "Smoke")
	public void SNwithvalidinfo() {
		TypeByXpath(aa.EmailPh,bb.Email);
		TypeByXpath(aa.PassWord,bb.Pass);
		ClickById(aa.LoginBtn);
		
	}

}
