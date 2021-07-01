package com.qa.Pages;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;
public class SearchPage extends Base{

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	WebElement searchbox;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement button;



public SearchPage() throws IOException {
	
	PageFactory.initElements(driver, this);
}

public String validatePageTitle() {
	return driver.getTitle();
}

public WikiPage searchbox(String searchitem) throws IOException {
	searchbox.sendKeys(searchitem);	
	button.click();
	return new WikiPage();
	
}


}