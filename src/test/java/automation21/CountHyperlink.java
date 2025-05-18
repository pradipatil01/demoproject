package automation21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperlink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
	    driver.manage().window().maximize();

        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
       
        System.out.println("Total Link of Webpage : " + linkElements.size());
        for(WebElement el: linkElements) 
        {
        	System.out.println(el.getText());       	
        }
        driver.close();

	}

}
