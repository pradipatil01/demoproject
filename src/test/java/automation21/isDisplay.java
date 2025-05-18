package automation21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.awtui.Logo;

public class isDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		driver.manage().window().maximize();

		boolean Display = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(Display == true) {
			System.out.println("Logo is display");
		} else {
			System.out.println("Logo is not display");
		}
		
		boolean enbled = driver.findElement(By.xpath("//a[normalize-space()='Already have an account?']")).isEnabled();
		if(enbled == true) {
			System.out.println("link is avaible");
		} else {
			System.out.println("link is not avaible");
		}
		
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
		boolean selected = driver.findElement(By.xpath("(//input[@id='sex'])[2]")).isSelected();
		if(selected == true) {
			System.out.println("selected is male");
		} else {
			System.out.println("selected is not male");
			
			driver.quit();
		}
	}

}
