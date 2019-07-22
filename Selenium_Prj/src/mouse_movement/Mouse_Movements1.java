package mouse_movement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Movements1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Workspace\\Selenium_Prj\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		driver.get("https://www.spicejet.com");
		
		Thread.sleep(3000);
		
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'MENU')]")))
		.moveToElement(driver.findElement(By.xpath("//a[@href='javascript:void();']")))
		.moveToElement(driver.findElement(By.xpath("//a[@href='CarriageOfLiveAnimals.aspx']")))
		.click()
		.build()
		.perform();
		
		
	/*	driver.findElement(By.xpath("//span[contains(text(),'MENU')]")).click();
driver.findElement(By.xpath("//a[@href='javascript:void();']")).click();
driver.findElement(By.xpath("//a[@href='CarriageOfLiveAnimals.aspx']")).click();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
