package day1.browseropening;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
		String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String actualURL=driver.getCurrentUrl();
		System.out.println("Login Page validation status: "+actualURL.equals(expectedURL));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		String expectedURL1="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";	
		String actualURL1=driver.getCurrentUrl();
		System.out.println("Home Page validation status: "+actualURL1.equals(expectedURL1));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-userdropdown-tab"))).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
