package day1.browseropening;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//switching to required frame, place the item from 1 to 7 ---> 7 to 1
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions act=new Actions(driver);
		List<WebElement> srcList =driver.findElements(By.className("ui-sortable-handle"));
		  int size = srcList.size();
		
		  for (int i = size - 1; i >= 0; i--) {
	            WebElement source = srcList.get(i);
	            WebElement target = srcList.get(0); // Target the first element for moving
	            act.clickAndHold(source).moveToElement(target).release().build().perform();
	        }
        System.out.println("Items reordered successfully.");
    }
		
		
	}

