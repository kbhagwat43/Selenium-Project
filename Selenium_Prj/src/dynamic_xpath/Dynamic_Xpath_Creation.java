package dynamic_xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath_Creation {
 public static void main(String[] args) {
	 
	 
	 System.setProperty("webdriver.chrome.drive", "E:\\Selenium Workspace\\Selenium_Prj\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 
	 driver.get("https://www.google.com/");
	 
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("fb");
	 driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	
	 
	 driver.findElement(By.xpath("//h3[contains(text(),'Facebook - Log In or Sign Up')]")).click();
	 
	 List<WebElement> element_list=driver.findElements(By.tagName("a"));
	 int size=element_list.size();
	 System.out.println(size);
	 for(int i=0;i<size;i++)
	 {
		 
		 String text=element_list.get(i).getText();
		 System.out.println(text);
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	
	
	
	
	
	
 }	
}
