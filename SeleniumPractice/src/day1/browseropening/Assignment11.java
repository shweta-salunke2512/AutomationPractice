package day1.browseropening;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
		driver.manage().window().maximize();
		
		WebElement firstNameInputField=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		System.out.println("is first name input field visible? "+firstNameInputField.isDisplayed());
		System.out.println("is first name input field functional/editable or not? "+firstNameInputField.isEnabled());
		System.out.println("Default value of first name input field: "+firstNameInputField.getAttribute("value"));
		
		WebElement lastNameInputField=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		System.out.println("is last name input field visible? "+lastNameInputField.isDisplayed());
		System.out.println("is last name input field functional/editable or not? "+lastNameInputField.isEnabled());
		System.out.println("Default value of first name input field: "+lastNameInputField.getAttribute("value"));
	
		WebElement radioButtonMale=driver.findElement(By.xpath("//input[@value='Male']"));
		System.out.println("is last name input field visible? "+radioButtonMale.isSelected());
		System.out.println("is last name input field functional/editable or not? "+radioButtonMale.isEnabled());
		System.out.println("Default value of first name input field: "+radioButtonMale.getAttribute("value"));
		
		WebElement radioButtonFemale=driver.findElement(By.xpath("//input[@value='FeMale']"));
		System.out.println("is last name input field visible? "+radioButtonFemale.isSelected());
		System.out.println("is last name input field functional/editable or not? "+radioButtonFemale.isEnabled());
		System.out.println("Default value of first name input field: "+radioButtonFemale.getAttribute("value"));
		
		
	}

}
