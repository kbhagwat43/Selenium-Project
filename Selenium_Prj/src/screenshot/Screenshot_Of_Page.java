package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Of_Page {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Workspace\\Selenium_Prj\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			driver.get("http://www.google.com");
			
		File src=((TakesScreenshot	)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\Selenium Workspace\\Selenium_Prj\\src\\screenshot\\google.jpeg")	);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
