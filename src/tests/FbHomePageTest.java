package tests;

import org.testng.annotations.Test;

import base.Config04;
import helper.FbHelper;
import locators.FbLocators01;
import values.FbValues01;

public class FbHomePageTest extends Config04 {
	
	
	FbLocators01 aa = new FbLocators01();
	FbValues01 bb = new FbValues01();
	FbHelper cc = new FbHelper();
	
	
	@Test(priority=1,groups = "Random")
	public void FbURLvarify() {
	String URL = 	driver.getCurrentUrl();
	System.out.println("URL:"+URL);
		
	}
	
	@Test(priority=2, groups= {"Random"})
	public void tilleTest() {
	String tittle =	driver.getTitle();
	System.out.println("Tille:"+tittle);
	}
	

}
