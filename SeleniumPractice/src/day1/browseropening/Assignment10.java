package day1.browseropening;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
		driver.manage().window().maximize();
		
		WebElement userNameInputField=driver.findElement(By.name("username"));
		System.out.println("is username input field visible? "+userNameInputField.isDisplayed());
		System.out.println("is username input field functional/editable or not? "+userNameInputField.isEnabled());
		System.out.println("Default value of username input field: "+userNameInputField.getAttribute("value"));
		
		WebElement passwordInputField=driver.findElement(By.name("password"));
		System.out.println("is password input field visible? "+passwordInputField.isDisplayed());
		System.out.println("is password input field functional/editable or not? "+passwordInputField.isEnabled());
		System.out.println("Default value of password input field: "+passwordInputField.getAttribute("value"));
		
		WebElement signInButton=driver.findElement(By.tagName("button"));
		System.out.println("is Signin button visible/displayed? "+signInButton.isDisplayed());
		System.out.println("is Signin button functional/clickable? "+signInButton.isEnabled());
		System.out.println("Signin button name? "+signInButton.getText());
		
		
	}

}
