package demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;


public class TestFacebook {

	

	public static void main(String[] args) {
		//final TimeUnit SECOND = null;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://iotlink.com.vn/Account/Login?returnUrl=http%3A%2F%2Fiotlink.com.vn%2F");
		//driver.get("http://iotlink.com.vn");
		//driver.get("http://map.map4d.vn");
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(2, SECOND);
		//driver.close();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("admin@iotlink.com.vn");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("password#1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.get("http://iotlink.com.vn/Careers?page=1#Recruitment");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		try {
			Thread.sleep(3000);
								driver.findElement(By.id("btn-listRecruitment")).click();
			//driver.findElement(By.xpath("//a[text()='Quản lý tin tuyển dụng']")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} 

		try {
			Thread.sleep(3000);
			driver.findElement(By.id("btn-createRecruitment")).click();
			//driver.findElement(By.xpath("//a[@href ='/Recruiment/CreateView']")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} 
        // input data into [Tieu De] text box
		driver.findElement(By.xpath("//*[@id=\"InformationTitle\"]")).sendKeys("tuyen vi tri admin");
		// input data into [Mo Ta] text box
		driver.findElement(By.xpath("//*[@id=\"Description\"]")).sendKeys("admin tuyen dụng");
		// input data into [Hạn Nộp] text box
		driver.findElement(By.xpath("//*[@id=\"DeadlineString\"]")).sendKeys("27/02/2019");
		// input data into [Vi trí tuyển dụng] text box
		Select vttd= new Select(driver.findElement(By.xpath("//*[@id=\"CategoryId\"]")));
		vttd.selectByIndex(6);
		//Select sele = new Select(driver.findElement(By.xpath("//*[@id=\"CategoryId\"]")));
		//sele.selectByVisibleText("MAP");
		// input data into [Nơi làm việc] text box
		Select sele1 = new Select(driver.findElement(By.xpath("//*[@id=\"CityId\"]")));
			//sele1.selectByIndex(2);
		sele1.selectByVisibleText("Đà Nẵng");
		// input data into [Số lượng] text box
		driver.findElement(By.xpath("//*[@id=\"Number\"]")).sendKeys("2");
		// input data into [Yêu cầu về giới tính] combo box
		Select ycgt = new Select(driver.findElement(By.xpath("")));
		ycgt.selectByVisibleText("Nam");		
		Select gt = new Select(driver.findElement(By.xpath("//*[@id=\"Gender\"]")));
		gt.selectByIndex(2);
		// input data into [HÌnh Thức làm việc] text box
				driver.findElement(By.xpath("//*[@id=\"FormOfWork\"]")).sendKeys("chinh thuc");
		// input data into [Mức Lương] text box
		driver.findElement(By.xpath("//*[@id=\"Wage\"]")).sendKeys("7 triệu");
		
		// input data into [Mô tả công việc] text box
		driver.findElement(By.xpath("//*[@id='JobDescription']")).sendKeys("lam full time");
		
		// input data into [Yêu cầu công việc] text box
		driver.findElement(By.xpath("//*[@id=\"JobRequirements\"]")).sendKeys("23 le thsnh ong");
		// input data into [Phúc lợi] text box
		driver.findElement(By.xpath("//*[@id=\"Welfare\"]")).sendKeys("huong luong 12 và tháng 13");
		//driver.findElement(By.xpath("")).sendKeys("");
		// click into [Đồng ý] button
		driver.findElement(By.xpath("//*[@id=\"formCreate\"]/div/div/div[2]/div[8]/div[2]/button")).click();
		
		
		
		
		//driver.quit();
		
	}
	

}
