package testPrefeexAdmin;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class createBusiness {
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
	public void businessCreation() {
		driver.findElement(By.linkText("Sales")).click();
		driver.findElement(By.linkText("Business")).click();
		driver.findElement(By.linkText("Create Business")).click();
		driver.findElement(By.xpath("//input[@name='primaryPhoto']")).sendKeys("E:\\Sundarban Tour\\WP_20191227_08_49_36_Pro.jpg");
		driver.findElement(By.name("name")).sendKeys("dummy");
		List<WebElement> list = driver.findElements(By.xpath("//p-dropdown/div/div[5]/div/ul/p-dropdownitem"));
		//System.out.println(list.size());
		for(int i=0; i < list.size(); i++) {
			if(list.get(i).getText().equals("Restaurant")) {
				list.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//button[contains(text(), 'All Cuisine')]")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Fine Dine')]")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Chinese')]")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Thai')]")).click();
		driver.findElement(By.xpath("//button//span[contains(text(), ' Drinking place ')]")).click();
		driver.findElement(By.xpath("//button//span[contains(text(), ' Just Too Good ')]")).click();
		driver.findElement(By.xpath("//button//span[contains(text(), ' Very Very Noice ')]")).click();
		driver.findElement(By.name("email")).sendKeys("p1234@gmail.com");
		driver.findElement(By.xpath("//div//button[contains(text(), '+')]")).click();
		driver.findElement(By.name("email")).sendKeys("p1235@gmail.com");
		driver.findElement(By.xpath("//div//button[contains(text(), '+')]")).click();
		driver.findElement(By.name("phone")).sendKeys("01987836545");
		driver.findElement(By.xpath("//div//button[contains(text(), '+')]")).click();
		driver.findElement(By.name("phone")).sendKeys("01987836546");
		driver.findElement(By.xpath("//div//button[contains(text(), '+')]")).click();
		driver.findElement(By.name("address")).sendKeys("banani, Dhaka");
		driver.findElement(By.name("capacity")).sendKeys("20");
		driver.findElement(By.name("latitude")).sendKeys("-3.22");
		driver.findElement(By.name("longitude")).sendKeys("23.9990");
		driver.findElement(By.name("location")).sendKeys("Bangladesh");
		driver.findElement(By.name("prefeexSharedPercentage")).sendKeys("10");
		driver.findElement(By.name("vatPercentage")).sendKeys("15");
		driver.findElement(By.name("serviceChargePercentage")).sendKeys("10");
		driver.findElement(By.name("details")).sendKeys("details");
		driver.findElement(By.name("photos")).sendKeys("D:\\Screen shots\\1.png");
		driver.findElement(By.name("photos")).sendKeys("D:\\Screen shots\\3.png");
		driver.findElement(By.xpath("//button//span[contains(text(), ' Submit ')]")).click();
		}
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	

}
