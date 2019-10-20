package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	

	@Test(groups = {"Random"})
	public void linkTest01() {
	//List<WebElement> e1=	driver.findElements(By.xpath("//*[@id=\"pageFooter\"]"));
	//int links = e1.size();
	//System.out.println(links);
	WebElement e1= driver.findElement(By.xpath("//*[@id=\"pageFooter\"]"));
	List<WebElement> e2= e1.findElements(By.tagName("a"));
	int links = e2.size();
	System.out.println("Links Count:"+links);
	e2.iterator(); 
	
		
	}
}
