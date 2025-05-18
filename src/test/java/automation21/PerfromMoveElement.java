package automation21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerfromMoveElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.in/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//div[@class='desktop-menu__links']//div[5]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		driver.quit();

	} 

}
