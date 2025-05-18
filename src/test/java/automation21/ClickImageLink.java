package automation21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickImageLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\wb\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.opencart.com/index.php?route=cms/demo");
		    driver.manage().deleteAllCookies();
		    driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
		    if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
			{
				System.out.println("Test Passed");
			}

			else {
				System.out.println("Test Failed");
			}
			driver.quit();
		}
	}
