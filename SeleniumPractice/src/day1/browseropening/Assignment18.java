package day1.browseropening;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        driver.findElement(By.cssSelector("a[href='samsung-phones-9.php']")).click();
        // Check if pagination exists
        List<WebElement> paginationLinks = driver.findElements(By.cssSelector(".nav-pages a"));
        System.out.println("Pagination link names:" + paginationLinks.size());
        for (WebElement option : paginationLinks) {
        	System.out.println(option.getText());
        	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			
    		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".nav-pages a"))).click();
        	option.click();
            System.out.println("Page URL: " + driver.getCurrentUrl());
        }
        
	}

}
