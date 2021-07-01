package com.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.Pages.SearchPage;
import com.qa.Pages.WikiPage;



public class SearchPageTest extends Base {
	SearchPage sp ;
	WikiPage wp;

	public SearchPageTest() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		sp = new SearchPage ();
	}
	
	@Test(priority='1')
	public void testvalidatePageTitle() {
	String title = sp.validatePageTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Wikipedia");
	}
	
	@Test(priority ='2')
	public void testsearchbox() throws IOException {
		 wp = sp.searchbox(prop.getProperty("searchitem"));
	}
	
	
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

