package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ffxLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		System.setProperty(" webdriver.gecko.driver ", "C:\\Users\\Biplab\\eclipse-workspace\\SeleniumProject\\Resources\\gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.reddit.com");
		
		
		driver.close();
	}
	

}
