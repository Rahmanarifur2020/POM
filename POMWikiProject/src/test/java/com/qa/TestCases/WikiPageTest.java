package com.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.Pages.SearchPage;
import com.qa.Pages.WikiPage;

public class WikiPageTest extends Base {
	
	SearchPage sp;
	WikiPage wikiPage;

	public WikiPageTest() throws IOException {
		super();
	
	}

	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		sp = new SearchPage();
		wikiPage = sp.searchbox(prop.getProperty("searchitem"));
		
	}
	
	@Test(priority='1')
	public void verifywikipageTitle() {
		String wikiPagetitle = wikiPage.validatePageTitle();
		Assert.assertEquals(wikiPagetitle, "selenium automation - Search results - Wikipedia");
	}
	
	@Test(priority='2')
	public void testcreateaccountLink() {
		wikiPage.clickOnContactUs();
	}
	
	@Test(priority='3')
	public void testmainpageLink() {
		wikiPage.clickOnMainPage();
	}
	
	@Test(priority='4')
	public void testcontactUs() {
		wikiPage.clickOnContactUs();
	}
	
	
	
	
}
