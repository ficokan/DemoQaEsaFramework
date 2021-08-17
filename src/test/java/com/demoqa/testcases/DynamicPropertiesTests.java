package com.demoqa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.base.TestBase;
import com.demoqa.pages.DynamicPropertiesPage;

public class DynamicPropertiesTests extends TestBase{

	DynamicPropertiesPage dynamicProperties = new DynamicPropertiesPage();
	
	@BeforeMethod
	public void setUp() {
		initialization();
		validateHeader();
		}
	
	// Verify first button will be enabled
	@Test(priority=1)
	public void dynamicPropertiesPageTest1() {
		dynamicProperties.goToPageDynamicProperties();
		dynamicProperties.validateEnabledButton();
	}
	
	// Verify second button will change color
	@Test(priority=2)
	public void dynamicPropertiesPageTest2() {
		dynamicProperties.goToPageDynamicProperties();
		dynamicProperties.validateColorChange();
	}
	
	// Verify third button will appear
	@Test(priority=3)
	public void dynamicPropertiesPageTest3() {
		dynamicProperties.goToPageDynamicProperties();
		dynamicProperties.validateVisibleButton();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
