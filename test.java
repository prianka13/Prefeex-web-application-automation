package testPrefeexAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    WebDriver driver;
    
    public void invokeBroeser() {
    	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    	
    	driver.get("https://admin.test.prefeex.com/user/sign-in");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test obj = new test();
		obj.invokeBroeser();

	}

}
