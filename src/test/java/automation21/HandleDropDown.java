package automation21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
	    //driver.manage().window().maximize();
	    WebElement element = driver.findElement(By.id("input-country"));
	    Select dropdown = new Select(element);
	    //dropdown.selectByVisibleText("Hong Kong");
	    //dropdown.selectByValue("98");
	    dropdown.selectByIndex(3);
	    
	    if(dropdown.isMultiple())
	    {
	    	System.out.println("Drop down is multiple");
	    
	    } 
	    else
	    {
	    	System.out.println("Drop down is not multiple");
	    }
	    List<WebElement>alldropdownOptions = dropdown.getOptions();
	    
	    for(WebElement el: alldropdownOptions)
	    {
	    	System.out.println(el.getText());
	    }	    
	}

}
