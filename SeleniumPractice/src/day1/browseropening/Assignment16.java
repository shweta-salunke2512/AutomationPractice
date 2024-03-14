package day1.browseropening;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open gsm, validate home page, get mobile phone name count from phone finder, print mobile phone name
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com/");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
		driver.manage().window().maximize();
		
		String expectedTitle="GSMArena.com - mobile phone reviews, news, specifications and more...";
       	String actualTitle=driver.getTitle();
       	
       	if(actualTitle.equals(expectedTitle))
       	{
       	 System.out.println("Home page validated successfully.");
        } else {
            System.out.println("Home page validation failed. Expected title: " + expectedTitle + ", Actual title: " + actualTitle);
        }
       	List<WebElement> phoneNames = driver.findElements(By.cssSelector(".brandmenu-v2.light.l-box.clearfix li"));
        System.out.println("Option count:" + phoneNames.size()); 
        for (WebElement option : phoneNames) {
            System.out.println(option.getText());
        }
        driver.findElement(By.xpath("//a[@href='samsung-phones-9.php']")).click();
		
		
	}

}
