package automation21;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Selenium21 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\wb\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
//		driver.get("https://demoqa.com/slider");
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement slidler = driver.findElement(By.xpath("//div[@id='HTML7']//span[2]"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(slidler, 50,0).perform();
		
  
	
		
	}
}
