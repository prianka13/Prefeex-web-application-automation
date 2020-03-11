package testPrefeexAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class adminLogIn {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://admin.test.prefeex.com/user/sign-in");
	}
	
	@Test
	public void logInAdmin() {
	driver.findElement(By.id("email")).sendKeys("psaha1023@gmail.com");
	driver.findElement(By.id("password")).sendKeys("1234");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
