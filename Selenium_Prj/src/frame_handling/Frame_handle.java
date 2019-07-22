package frame_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_handle {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium Workspace\\\\Selenium_Prj\\\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.switchTo().frame( "a077aa5e");
		
		driver.findElement(By.xpath("html/body/a/img")).click();
		Thread.sleep(1000);
		
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		
		WebElement asd=driver.findElement(By.xpath("//*[@id='rt-maintop']/div[1]/p"));
		System.out.println(asd.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
