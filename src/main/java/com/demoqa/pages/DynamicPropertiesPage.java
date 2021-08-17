package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demoqa.base.TestBase;

public class DynamicPropertiesPage extends TestBase{
	
	String disabledButton = "//button[@id='enableAfter' and @disabled]";
	String colorChangeButton = "//button[@id='colorChange' and contains(@class, 'text-danger')]";
	String visibilityButton = "//button[@id='visibleAfter']";
	
	public void goToPageDynamicProperties() {
		driver.navigate().to("https://demoqa.com/dynamic-properties");
	}
	
	public boolean validateEnabledButton() {
		WebElement willEnable = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(disabledButton)));
		willEnable.isEnabled();
		return true;
	}
	
	public boolean validateColorChange() {
		WebElement willChangeColor = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(colorChangeButton)));;
		willChangeColor.isDisplayed();
		return true;
	}
	
	public boolean validateVisibleButton() {
		WebElement willBeVisible = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(visibilityButton)));;
		willBeVisible.isDisplayed();
		return true;
	}
}
