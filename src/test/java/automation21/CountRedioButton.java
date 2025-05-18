package automation21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRedioButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
	    //driver.manage().window().maximize();
	
        List<WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Total no of Radio Button on web page:" + radioButtonList.size());
        driver.quit();

	}

}
