package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demoqa.base.TestBase;

public class StudentRegistrationFormPage extends TestBase{
	
	public void goToPageRegistrationForm() {
		driver.navigate().to("https://demoqa.com/automation-practice-form");
	}
	
	public boolean validateFormIsVisible() {
		WebElement practiceForm = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='practice-form-wrapper']")));;
		practiceForm.isDisplayed();
		return true;
	}
	
	public boolean enterFirstName() {
		driver.findElement(By.id("firstName")).sendKeys("Filip");
		return true;
	}
	
	public boolean enterLastName() {
		driver.findElement(By.id("lastName")).sendKeys("Ristic");
		return true;
	}
	
	public boolean enterUserMail() {
		driver.findElement(By.id("userMail")).sendKeys("filip88ristic@gmail.com");
		return true;
	}
	
	public boolean checkMaleGender() {
		driver.findElement(By.id("gender-radio-1")).click();
		return true;
	}
	
	public boolean enterUserMobileNumber() {
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		return true;
	}
	
	public boolean checkHobbiesCheckbox() {
		driver.findElement(By.id("hobbies-checkbox-2")).click();
		return true;
	}
	
	public boolean uploadPicture() {
		driver.findElement(By.id("uploadPicture")).sendKeys("D:\\SeleniumWorkSpace\\DemoQaEsaFramework\\src\\main\\java\\pictureFolder");
		return true;
	}
	
	public boolean selectState() {
		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("NCR");
		return true;
	}
	
	public boolean selectCity() {
		Select state = new Select(driver.findElement(By.id("city")));
		state.selectByVisibleText("Delhi");
		return true;
	}
	
	public boolean clickSubmitButton() {
		driver.findElement(By.id("submit")).click();
		return true;
	}
	
	public boolean verifyFormSubmitted() {
		WebElement practiceForm = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content")));;
		practiceForm.isDisplayed();
		return true;
	}
}
