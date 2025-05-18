package automation21;

import java.net.CookieHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\wb\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		//WebElement Button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement ButtonClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

		Actions act = new Actions(driver);
		act.doubleClick(ButtonClick).perform();
		
		driver.quit(); 
	}
}
