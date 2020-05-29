import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	
	public static WebDriver driver;  
	
	
	@BeforeSuite
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java Setup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void LoginTest() throws InterruptedException
	
	{
		
		driver.get("https://en-gb.facebook.com/login/");
		driver.findElement(By.cssSelector("#email")).sendKeys("8830404367");
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("kadambaripatil");
		driver.findElement(By.cssSelector("#loginbutton")).click();
		System.out.println("welcome");
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
