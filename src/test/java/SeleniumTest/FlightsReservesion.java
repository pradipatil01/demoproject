package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightsReservesion {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.demo.guru99.com/test/newtours/reservation.php");
		
		WebElement OneWayRadioButton = driver.findElement(By.xpath("//input[@value='oneway']"));
		boolean selectState = OneWayRadioButton.isSelected();

		if(selectState == false) {
			OneWayRadioButton.click();
		}

		
		WebElement element = driver.findElement(By.xpath("//select[@name='passCount']"));		
		Select dropdown = new Select(element);
		dropdown.selectByValue("2");
		
		WebElement From = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select from = new Select(From);
		from.selectByVisibleText("London");

		WebElement fromMonth = driver.findElement(By.xpath("//select[@name='fromMonth']"));
		Select frommonth = new Select(fromMonth);
		frommonth.selectByVisibleText("May");
		
		WebElement FromDay = driver.findElement(By.xpath("//select[@name='fromDay']"));
		Select Fromday = new Select(FromDay);
		Fromday.selectByValue("10");
				
		WebElement Arriving = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select arriving = new Select(Arriving);
		arriving.selectByVisibleText("New York");
		
		WebElement Returnning = driver.findElement(By.xpath("//select[@name='toMonth']"));
		Select returnning  = new Select(Returnning);
		returnning .selectByVisibleText("June");
		
		WebElement Today = driver.findElement(By.xpath("//select[@name='toDay']"));
		Select today  = new Select(Today);
		today.selectByValue("20");
		
		WebElement Serviceclass = driver.findElement(By.cssSelector("input[value='Business']"));
		boolean select = Serviceclass.isSelected();

		if(select == false) {
			 Serviceclass .click();
		}
		
		WebElement Airline = driver.findElement(By.xpath("//select[@name='airline']"));
		Select airline  = new Select(Airline);
		airline .selectByVisibleText("Blue Skies Airlines");
		
		WebElement button = driver.findElement(By.xpath("//input[@name='findFlights']"));
		button.click();
		
		WebElement BackToHome = driver.findElement(By.xpath("//img[@src='images/home.gif']"));
		BackToHome.click();
		driver.close();
	}

}
