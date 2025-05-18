package automation21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\Dell\\Desktop\\Demofile.txt");

        driver.quit();
	}

}
