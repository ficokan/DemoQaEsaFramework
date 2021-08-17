package com.demoqa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.base.TestBase;
import com.demoqa.pages.StudentRegistrationFormPage;

public class StudentRegistrationFormTests extends TestBase{

	StudentRegistrationFormPage registrationForm = new StudentRegistrationFormPage();
	
	@BeforeMethod
	public void setUp() {
		initialization();
		validateHeader();
		}
	
	// Verify registration form can be submitted
	@Test(priority=1)
	public void registrationFormTest() {
		registrationForm.goToPageRegistrationForm();
		registrationForm.validateFormIsVisible();
		registrationForm.enterFirstName();
		registrationForm.enterLastName();
		registrationForm.enterUserMail();
		registrationForm.checkMaleGender();
		registrationForm.enterUserMobileNumber();
		registrationForm.checkHobbiesCheckbox();
		registrationForm.uploadPicture();
		registrationForm.selectState();
		registrationForm.selectCity();
		registrationForm.clickSubmitButton();
		registrationForm.verifyFormSubmitted();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
