package mouse_movement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Movements {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium Workspace\\Selenium_Prj\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	driver.get("https://www.spicejet.com");
	
	Actions action= new Actions(driver);
	
	Thread.sleep(1000);
	
	action.moveToElement(driver.findElement(By.xpath("//*[@id='highlight-addons']")))
	.moveToElement(driver.findElement(By.xpath("//a[@href='CarryMoreOnboard.aspx']")))
	//.moveToElement(driver.findElement(By.linkText("Carry More Onboard")))
	.click()
	.build()
	.perform();
	
	//Thread.sleep(5000);
	
	//driver.quit();
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
