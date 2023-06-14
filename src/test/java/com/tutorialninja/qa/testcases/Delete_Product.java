package com.tutorialninja.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialninja.qa.base.BaseClass;

public class Delete_Product extends BaseClass {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=initilisebrowserandopenBrowser("chrome");
		
	}
	
	@Test
public void ADD_To_Cart() {
	driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("HP");
	driver.findElement(By.xpath("//i[contains(@class,\"fa-search\")]")).click();
	driver.findElement(By.linkText("HP LP3065")).click();
	driver.findElement(By.xpath("//button[@id=\"button-cart\"]")).click();
	
	driver.findElement(By.xpath("//div[@class=\"btn-group btn-block\"]/button")).click();
	driver.findElement(By.xpath("//button[@class=\"btn btn-danger btn-xs\"]")).click();
	String actoneproductvalue = driver.findElement(By.xpath("//div[contains(text(),\"Success: You\")]")).getText();
	String exponeproductvalue="Success: You have added ";
	Assert.assertTrue(actoneproductvalue.contains(exponeproductvalue),"Success: You have not added ");
}
}
