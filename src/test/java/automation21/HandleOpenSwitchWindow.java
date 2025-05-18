package automation21;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;


public class HandleOpenSwitchWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		System.out.println("first page" + driver.getTitle());
//		 driver.switchTo().window(WindowType.TAB);

		driver.get("https://www.Facebook.com/");
		System.out.println("second tab" + driver.getTitle());

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		driver.close();
		driver.switchTo().window(handles.get(0));
		System.out.println("first page" + driver.getTitle());

	}
}
