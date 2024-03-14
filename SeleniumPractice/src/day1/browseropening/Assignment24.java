package day1.browseropening;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
Actions act=new Actions(driver);
		
List<WebElement> menuOptions = driver.findElements(By.xpath("//div[@class='ds-popper-wrapper']"));
		System.out.println("Main menu count: "+menuOptions.size());
		
		Thread.sleep(2000);
		for(int i=0;i<menuOptions.size();i++) {
			act.moveToElement(menuOptions.get(i)).perform();
		}

		
		
	}

}
