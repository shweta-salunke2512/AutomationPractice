package day1.browseropening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");	
		String expectedURL="https://demo.vtiger.com/vtigercrm/index.php";
		String actualURL=driver.getCurrentUrl();
		System.out.println("Login Page validation status: "+actualURL.equals(expectedURL));
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
				driver.findElement(By.id("password")).clear();
				driver.findElement(By.id("password")).sendKeys("admin");
				driver.findElement(By.tagName("button")).click();
				String expectedURL1="https://demo.vtiger.com/vtigercrm/index.php";	
				String actualURL1=driver.getCurrentUrl();
				System.out.println("Home Page validation status: "+actualURL1.equals(expectedURL1));	
				driver.close();	
				
	}

}
