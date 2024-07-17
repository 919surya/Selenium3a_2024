package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocator {
	
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void locateElements() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		driver.findElement(By.name("lastname")).sendKeys("java");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-4")).click();
		driver.findElement(By.id("profession-1")).click();
//		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
//		driver.findElement(By.partialLinkText("Link Test : Page Change")).click();
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\soyuz\\OneDrive\\Documents\\epic.txt");
		Thread.sleep(6000);
//"C:\Users\soyuz\OneDrive\Documents\epic.txt"		
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
