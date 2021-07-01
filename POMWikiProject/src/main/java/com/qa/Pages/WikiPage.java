package com.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;

public class WikiPage extends Base {
	
	
	
	
	@FindBy(linkText="Create account")
	WebElement CreateAccountLink;
	
	@FindBy(linkText="Main page")
	WebElement MainpageLink;
	
	@FindBy(linkText="Contact us")
	WebElement Contactus;

	public WikiPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	

	public CreateAccountPage clickOncreateAccoount() {
		 CreateAccountLink.click();
		 return new CreateAccountPage();
		
	}
	
	
	public MainPage clickOnMainPage() {
		MainpageLink.click();
		return new MainPage();
		
	}
	
	public ContactUsPage clickOnContactUs() {
		
		Contactus.click();
		return new ContactUsPage();
	}
	
	
	
	
	
	
	
	
}


