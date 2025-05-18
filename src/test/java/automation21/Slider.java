package automation21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://demoqa.com/slider");
		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));

		// Initialize Actions class
		Actions act = new Actions(driver);

		// Drag the slider (example: move it 50 pixels to the right)
		act.dragAndDropBy(slider, 50, 0).perform();

		driver.quit();

	}

}
