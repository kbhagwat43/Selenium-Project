package switch_browser_window;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Browser_Popup_Window {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Workspace\\Selenium_Prj\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://www.toolsqa.com/selenium-webdriver/handling-multiple-browsers-in-selenium-webdriver/%20http://toolsqa.com/automation-practice-switch-windows/");
		
		driver.getTitle();
		
		driver.findElement(By.id("button1")).click();
		
		Set<String > handl=driver.getWindowHandles();
		Iterator<String> itr=handl.iterator();
		
		String parent_id=itr.next();
		System.out.println("parent window id : " +parent_id);
		
		String child_id=itr.next();
		System.out.println("child window id : " +child_id);
		
		driver.switchTo().window(child_id);
		driver.manage().window().maximize();
		
	String s=driver.getTitle();
		System.out.println(s);
		//String src=driver.findElement(By.xpath("//div[contains(text(),'Selenium Online Trainings')]")).getText();
		//System.out.println(src);
		
		
		
		
		
		
		
		
		
	}

}
