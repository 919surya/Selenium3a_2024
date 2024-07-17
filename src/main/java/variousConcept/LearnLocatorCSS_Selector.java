package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocatorCSS_Selector {
	
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
	public void cssSelector() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("Mr Tom");
		driver.findElement(By.cssSelector("input#sex-0")).click();
		driver.findElement(By.cssSelector("input#exp-6")).click();
		driver.findElement(By.cssSelector("input#profession-1")).click();
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Smith");
		// we can use multiple TagName[---][---][---]
		driver.findElement(By.cssSelector("input[id='tool-2'][name='tool'][value='Selenium Webdriver']")).click();
//		Thread.sleep(3000);
		
	}
//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
