package automation21;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapetureScreenShort {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\wb\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//WebElement element = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice'])")
	     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		 WebElement Section = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
//	     File scrFile = Section.getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(scrFile, new File("C:\\Users\\dell\\eclipse-workspace\\automationbatch\\ScreenShort\\Screenshort.png"));
	     driver.quit();
		
	} 
}
