package automation21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://training.rcvacademy.com/test-automation-practice-page");
	    driver.manage().window().maximize();
	    
	    String actualtoolTip = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");
	    
	    String expectedToolTip = "We ask for your age only for statistical purposes.";
	    
	    if(actualtoolTip.equals(expectedToolTip))
	    {
	    	System.out.println("test pass");
	    }
	    else
	    {
			System.out.println("test failed");

		}
	}
}
