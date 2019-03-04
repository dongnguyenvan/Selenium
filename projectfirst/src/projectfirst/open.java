package projectfirst;
import org.openqa.selenium.chrome.ChromeDriver;

public class open {
	
	public static void main (String[] args) {
//		System.setProperty("webdriver.firefox.marionette", "D:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String abc = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
     // launch Fire fox and direct it to the Base URL
        driver.get(abc);
     // get the actual value of the title
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       //close Fire fox
        driver.close();

	}

}
////
