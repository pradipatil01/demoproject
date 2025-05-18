package automation21;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\wb\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		try {
            // Open the initial URL
            driver.get("https://demoqa.com/slider");
            System.out.println("Opened first URL");

            // Use JavascriptExecutor to open a new tab
            ((JavascriptExecutor) driver).executeScript("window.open('https://www.flipkart.com/', '_blank');");
            System.out.println("Opened new tab with second URL");

            // Switch to the newly opened tab
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }

            System.out.println("Switched to new tab");
        } finally {
            // Close the browser
//            driver.quit();
        }
    }


	}


