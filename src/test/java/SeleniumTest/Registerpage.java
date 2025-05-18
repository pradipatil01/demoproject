package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registerpage {

	public static void main(String[] args) {
        WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.demo.guru99.com/test/newtours/register.php");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstName.sendKeys("Pradip");
		
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		LastName.sendKeys("Patil");

		WebElement Phone = driver.findElement(By.xpath("//input[@name='phone']"));
		Phone.sendKeys("1278738767");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='userName']"));
		Email.sendKeys("pradippatil2944@gmail.com");
		
		WebElement Address = driver.findElement(By.xpath("//input[@name='address1']"));
		Address.sendKeys("886");
				
		WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
		City.sendKeys("Jalgaon");
		
		WebElement State = driver.findElement(By.xpath("//input[@name='state']"));
		State.sendKeys("maharashtra");
		
		WebElement Postalcode = driver.findElement(By.xpath("//input[@name='postalCode']"));
		Postalcode.sendKeys("456662");
		
		WebElement Country = driver.findElement(By.xpath("//select[@name='country']"));
		Select country = new Select(Country);
		country.selectByVisibleText("INDIA");
		
		driver.close();
	}

}
