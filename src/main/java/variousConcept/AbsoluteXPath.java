package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {
	
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://objectspy.space/");
	}
	@Test
	public void xpathAbsoluteMethod() throws InterruptedException {
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[7]/input")).sendKeys("John");
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Zero");
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("it is easy");
		Thread.sleep(5000);
//absolute xpath: count <...from html upto <.. target element		
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
