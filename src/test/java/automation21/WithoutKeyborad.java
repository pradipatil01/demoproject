package automation21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutKeyborad {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");

		WebElement Textbox = driver.findElement(By.xpath("//input[@id='userName']"));
		Textbox.sendKeys("coding with PK");
		Thread.sleep(2000);

		Textbox.clear();
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		WebElement Text = driver.findElement(By.xpath("//input[@id='userName']"));
		actions.keyDown(Keys.SHIFT).build().perform();
		Text.sendKeys("c");

		actions.keyUp(Keys.SHIFT).build().perform();
		Text.sendKeys("oding with");

		actions.keyDown(Keys.SHIFT).build().perform();
		Text.sendKeys(" PK");
		Text.clear();

	}

}
