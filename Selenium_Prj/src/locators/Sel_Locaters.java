package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_Locaters {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Workspace\\Selenium_Prj\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("file:///E:/Selenium%20Software/Offline%20Website/index.html");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		
		System.out.println(1);
		
		driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a")).click();
		
		System.out.println(2);
		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		
		System.out.println(3);
		
		driver.findElement(By.id("username")).sendKeys("KISHOR");
		
		driver.findElement(By.id("mobile")).sendKeys("9822613338");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kbdad@ahiuds");
		
		driver.findElement(By.xpath("//*[@id='Male']")).click();
		
		//getting text from webpage.
		WebElement zxc=driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]"));
		System.out.println(zxc.getText());
		
		
	WebElement asd=	driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[6]/label"));
		String pw_text=asd.getText();
		System.out.println(pw_text);
		
		Select select= new Select(driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select")));
		select.selectByVisibleText("Maharashtra");
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("asdfgh");
		
		
		driver.findElement(By.xpath("//*[@id='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
