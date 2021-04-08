package com.qa.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenUrl {
	
	@Test
	public void LogintoFB() {
		System.setProperty("webdriver.chrome.driver","E:\\Manu_Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//ob.typeEmail("manu@tcs.com","manu1234");
	}
}

