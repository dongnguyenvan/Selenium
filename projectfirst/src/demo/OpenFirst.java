/**
 * 
 */
package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author PC
 *
 */
public class OpenFirst {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.iotlink.com.vn");
		driver.manage().window().maximize();
		String ourUrl = null;
		System.out.println("success " +ourUrl);

		//driver.get(ourUrl);
		
		
		
		
		
		
	}

}
