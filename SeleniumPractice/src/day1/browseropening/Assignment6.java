package day1.browseropening;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);    
		String expectedURL="https://www.saucedemo.com/";
		String actualURL=driver.getCurrentUrl();
		System.out.println("Login Page validation status: "+actualURL.equals(expectedURL));

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
				driver.findElement(By.id("password")).clear();
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				driver.findElement(By.id("login-button")).click();
				String expectedURL1="https://www.saucedemo.com/inventory.html";	
				String actualURL1=driver.getCurrentUrl();
				System.out.println("Home Page validation status: "+actualURL1.equals(expectedURL1));
				driver.findElement(By.id("react-burger-menu-btn")).click();
				
				driver.findElement(By.id("logout_sidebar_link")).click();
				
				
				driver.close();	
	}

}
