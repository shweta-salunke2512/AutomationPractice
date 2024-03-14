package day1.browseropening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		Thread.sleep(3000);
		String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String actualURL=driver.getCurrentUrl();
		System.out.println("Login Page validation status: "+actualURL.equals(expectedURL));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		String expectedURL1="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";	
		String actualURL1=driver.getCurrentUrl();
		System.out.println("Home Page validation status: "+actualURL1.equals(expectedURL1));
		driver.close();
		
	}

}
