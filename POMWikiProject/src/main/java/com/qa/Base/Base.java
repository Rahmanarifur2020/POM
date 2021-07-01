package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {


	public static WebDriver driver;

	public static Properties prop; 

	public Base() throws IOException {

		prop = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\arifu\\Documents\\New EclipseWorkSpace\\POMWikiProject\\src\\main\\java\\com\\qa\\Config\\configuration.properties");
		prop.load(file);

	}
	
	public static void initialization() {
		
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\arifu\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();

		}
		
		driver.manage().window().maximize(); // maximize the browser window

		driver.manage().deleteAllCookies(); // delete cookies on the browser
		
		String urlname = prop.getProperty("url1");

		driver.get(urlname);

		
	}

}
