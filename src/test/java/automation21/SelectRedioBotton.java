package automation21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRedioBotton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		WebElement RoundTripButton = driver.findElement(By.xpath("//label[@id='rt']"));
		//RoundTripButton.click();		
			if (RoundTripButton.isSelected()) {
				
				System.out.println("RoundTrip Radio Button Selected");
			}else {
				System.out.println("RoundTrip Radio Button not Selected");
			}
			
			//driver.quit();

	}
}
