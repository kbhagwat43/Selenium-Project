package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Browser {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Workspace\\Selenium_Prj\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//String pasc=driver.getPageSource();
		//System.out.println(pasc);
		driver.quit();
		
	}

}
