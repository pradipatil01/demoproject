package automation21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox  {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\wb\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)");
		
		
		 List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@id='sunday']"));

	        // Select all checkboxes
	        for (WebElement checkbox : checkboxes) {
	            if (!checkbox.isSelected()) {
	                checkbox.click();
	            }
	        }

	        // Uncheck all checkboxes
	        for (WebElement checkbox : checkboxes) {
	            if (checkbox.isSelected()) {
	                checkbox.click();
	            }
	        }
		
//		driver.findElement(By.xpath("//input[@id='male']")).click();
//		driver.findElement(By.xpath("//input[@id='Sunday']")).click();
		
		
		driver.quit();

	} 

}
