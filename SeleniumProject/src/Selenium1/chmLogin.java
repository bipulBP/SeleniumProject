package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chmLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = System.getProperty("user.dir");
        System.out.println(path);
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Biplab\\selenium jar2\\chromedriver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
    	driver.get(" https://www.facebook.com/");
    	driver.findElement(By.id("email")).sendKeys("biplabpoudel112@gmail.com");
    	driver.findElement(By.id("pass")).sendKeys("Aappllee@123");
    	driver.findElement(By.xpath("[@id=\"u_0_b\"] ")).click();
    	
    	
    	
    	driver.close();
		
		

	}

}