package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {
	
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://objectspy.space/");
		
	}
	@Test
	public void relativeXPathMethod() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Trum");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Cruse");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("abcd456");
		driver.findElement(By.xpath("//input[@id='sex-0']")).click();
		driver.findElement(By.xpath("//input[@id='exp-5']")).click();
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
//		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		
/* OR if not working on finding relative xpath; 
         we can use two AttributeNode sepetated by  and  */		
		driver.findElement(By.xpath("//input[@id='tool-2' and @name='tool']")).click();
		
/*  for link */		
//		driver.findElement(By.xpath("//a[text()='OS-API Product FrontEnd']")).click();
		
/* OR	also can use   contains  method */	
		driver.findElement(By.xpath("//a[contains(text(),'TF-API Product Backend')]")).click();
		
		
		Thread.sleep(5000);
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
