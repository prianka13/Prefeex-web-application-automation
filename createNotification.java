package testPrefeexAdmin;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class createNotification {
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
	driver.findElement(By.id("email")).sendKeys("psaha1023@gmail.com");
	driver.findElement(By.id("password")).sendKeys("1234");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void createNotification() {
	
	
	driver.findElement(By.linkText("Marketing")).click();
	driver.findElement(By.linkText("Notifications")).click();
	driver.findElement(By.linkText("Create Notification")).click();
	driver.findElement(By.name("email")).sendKeys("prianka@prefeex.com");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//label[contains(text(), ' Prianka Saha ')]")).click();
	driver.findElement(By.xpath("//button[contains(text(), 'Next')]")).click();
	
	driver.findElement(By.name("title")).sendKeys("Knock knock");
	driver.findElement(By.xpath("//input[@name='body']")).sendKeys("We are opening soon");
	driver.findElement(By.xpath("//textarea[@name='body']")).sendKeys("Stay with us for more update");
	driver.findElement(By.xpath("//input[@name='photo']")).sendKeys("E:\\Sundarban Tour\\WP_20191227_08_49_36_Pro.jpg");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button//span[contains(text(), ' Schedule At ')]")).click();
	//driver.findElement(By.xpath("//input[@name='dateForm']")).click();
	driver.findElement(By.xpath("//input[@name='dateForm']")).sendKeys("2020-02-19 12:30");
	//System.out.println("pp");
	driver.findElement(By.xpath("//p-footer//button[@type='button']")).click();
	System.out.println("pp");
	// this line is for send now
	//driver.findElement(By.xpath("//button//span[contains(text(), ' Send Now ')]")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
