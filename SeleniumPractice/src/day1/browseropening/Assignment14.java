package day1.browseropening;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open flipkart, validate home page, get main menu option, print main menu option
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
		driver.manage().window().maximize();
		
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
       	String actualTitle=driver.getTitle();
       	
       	if(actualTitle.equals(expectedTitle))
       	{
       	 System.out.println("Home page validated successfully.");
        } else {
            System.out.println("Home page validation failed. Expected title: " + expectedTitle + ", Actual title: " + actualTitle);
        }
       	List<WebElement> mainMenuOptions=	driver.findElements(By.className("_1ch8e_"));
      
     // Print main menu options
        System.out.println("Main Menu Options:");
        for (WebElement option : mainMenuOptions) {
            System.out.println(option.getText());
        }
    
       	}
       	
		
	}

