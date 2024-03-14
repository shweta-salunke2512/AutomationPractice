package day1.browseropening;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/xyz3");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   
		driver.manage().window().maximize();
		 
	//	String expectedURL="https://online.actitime.com/actuate/login.do";
		//String actualURL=driver.getCurrentUrl();
		//System.out.println("Login Page validation status: "+actualURL.equals(expectedURL));

		driver.findElement(By.id("username")).sendKeys("shweta01@vomoto.com");
				driver.findElement(By.name("pwd")).clear();
				driver.findElement(By.name("pwd")).sendKeys("Test@123");
				driver.findElement(By.id("loginButton")).click();
				
				// Using explicit wait for the next page to load
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		      wait.until(ExpectedConditions.urlToBe("https://online.actitime.com/xyz3/timetrack/enter.do"));
		        
			String expectedURL1="https://online.actitime.com/xyz3/timetrack/enter.do";	
				String actualURL1=driver.getCurrentUrl();
				System.out.println("Home Page validation status: "+actualURL1.equals(expectedURL1));
				Thread.sleep(2000);
				driver.findElement(By.id("logoutLink")).click();
				
				
				driver.close();	
	}

}
