package day1.browseropening;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		List<WebElement> suggestionList=driver.findElements(By.cssSelector("ul[class='G43f7e'] li"));
		System.out.println("Suggestion count +" + suggestionList.size());
		boolean suggestionFound = false;

        for (WebElement suggestion : suggestionList) {
            String suggestionText = suggestion.getText();
            System.out.println("Suggestion: " + suggestionText);

            if (suggestionText.equalsIgnoreCase("selenium")) {
                System.out.println("Suggestion matched: " + suggestionText);
                suggestion.click();
                suggestionFound = true;
                break; // No need to continue iterating once found
            }
        
        if (!suggestionFound) {
            System.out.println("Suggestion not found.");
        }
		}
	}
}
