package testPrefeexAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class createPromotion {
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
public void createPromotion() {
	driver.findElement(By.linkText("Marketing")).click();
	driver.findElement(By.linkText("Promotion")).click();
	driver.findElement(By.linkText("Create Promo Code")).click();
	driver.findElement(By.name("promoCode")).sendKeys("Code@123edit11");
	driver.findElement(By.name("title")).sendKeys("Promo code title");
	driver.findElement(By.name("description")).sendKeys("Promo code description");
	driver.findElement(By.name("numberOfUsagePerUser")).sendKeys("100");
	driver.findElement(By.xpath("//input[@name='activeFrom']")).sendKeys("11-03-2020 05:13");
	driver.findElement(By.xpath("//input[@name='expiredAt']")).sendKeys("11-12-2020 05:13");
	driver.findElement(By.name("flatAmount")).sendKeys("100");
	driver.findElement(By.name("flatAmountMinThresholdAmount")).sendKeys("500");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//a//i[@class='fa fa-plus']")).click();
	driver.findElement(By.name("email")).sendKeys("prianka@prefeex.com");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//label[contains(text(), ' Prianka saha ')]")).click();
	driver.findElement(By.xpath("//button[contains(text(), 'Next')]")).click();
	//driver.findElement(By.xpath("//div//label[contains(text(), ' Select All ')]")).click();
	//driver.findElement(By.xpath("//button[contains(text(), 'Next')]")).click();
	driver.findElement(By.xpath("//button//span[contains(text(), ' Submit ')]")).click();
	
	}
@AfterMethod
public void tearDown() {
	driver.quit();
}


}
