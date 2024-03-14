package day1.browseropening;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//open cricinfo, validate home page, get main menu option count, print main menu option name
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
		driver.manage().window().maximize();
		
		String expectedTitle="Today's Cricket Match | Cricket Update | Cricket News | ESPNcricinfo";
       	String actualTitle=driver.getTitle();
       	
       	if(actualTitle.equals(expectedTitle))
       	{
       	 System.out.println("Home page validated successfully.");
        } else {
            System.out.println("Home page validation failed. Expected title: " + expectedTitle + ", Actual title: " + actualTitle);
        }
        List<WebElement> menuOptions = driver.findElements(By.className("ci-nav-item ci-nav-text ci-nav-hover ds-cursor-pointer"));
        System.out.println("Option count:" + menuOptions.size());
        for (WebElement option : menuOptions) {
            System.out.println(option.getText());
        }
        
	}

}
