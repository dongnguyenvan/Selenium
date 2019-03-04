package demo;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class thuytop {
	
		WebDriver driver;
		WebDriverWait wait;
		private String userID, password, loginPageUrl;

	  
	//  @BeforeClass
	  public void beforeClass() {
		  /*Run before all testcases = pre-condition for all test cases*/
		  driver = new ChromeDriver();
		  wait = new WebDriverWait (driver, 30);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/v4/");
		  
	  }
	  public int radomNumber() {
		  Random rand = new Random();
		  int number = rand.nextInt(999999) + 1;
		  return number;
	  }

	
	 // @Test
	  public void TC_01_Register() {
		  /*Get login page Url*/
		  loginPageUrl = driver.getCurrentUrl();
		  
		  /*Click here link to open Register Page*/
		  driver.findElement(By.xpath("//a[text()='here']")).click();
		  
		  /*Wait for email textbox visible*/
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='emailid']"))));
		  
		  /*Input email radom */
		  driver.findElement(By.xpath("//input[@name= emailid]")).sendKeys("online05" + radomNumber() + "@gmail.com");
		  
		  /*Click Submit button*/
		  driver.findElement(By.xpath("//input[@name= 'btnLogin']")).click();
		  
		  /*Get text of UserID and Password*/
		 userID  = driver.findElement(By.xpath("//td[text()='User ID :']/following-sibling::td")).getText();
		 password = driver.findElement(By.xpath("//td[text()='User ID :']/following-sibling::td")).getText();
		  
	  }
	  
	 // @Test
	  public void TC_02_Login() {
		  /*Open Login page again*/
		  driver.get(loginPageUrl);
		  
		  /*Wait for UserID textbox visible*/
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='emailid']"))));
		  
		  /*Input to User/ Passwor textbox*/
		 driver.findElement(By.xpath("//input[@name= emailid]")).sendKeys(userID);
		 driver.findElement(By.xpath("//input[@name= password]")).sendKeys(password);
		 
		 /*Click LOGIN button*/
		  driver.findElement(By.xpath("//input[@name= 'btnLogin']")).click();
		  
			 
	  } 

	//  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

}
