package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpages {

	public static void main(String[] args) {
		WebDriver driver;
	     
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.demo.guru99.com/test/newtours/");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement login = driver.findElement(By.xpath("//input[@name='submit']"));// click operation
		username.sendKeys("pradip");
		pwd.sendKeys("1234");
		login.click();
		System.out.println("Sucessfully login");
		
		driver.close();
	}

}