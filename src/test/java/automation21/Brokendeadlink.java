package automation21;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokendeadlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        int rescode =200;
        int brokenLinkcnt = 0;
        System.out.println("Total Link on page : " + linkList.size());
        for(WebElement element: linkList) 
        {
        	String url = element.getAttribute("href"); 	
        	try {
        		URL urlLink = new URL(url);
        		HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
        		huc.setRequestMethod("HEAD");
        		huc.connect();
        		
				rescode = huc.getResponseCode();
				if (rescode >= 400) {
					System.out.println(url + "broken Link.");
					brokenLinkcnt++;
				}
			} catch (MalformedURLException e) {
			} catch (Exception e) {
			}
		}
		System.out.println("Total broken link:" + brokenLinkcnt);
		driver.quit();
	}

}
