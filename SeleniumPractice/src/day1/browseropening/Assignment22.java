package day1.browseropening;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//calender handling redbus
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Pune");
		driver.findElement(By.className("placeHolderMainText")).click();
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Goa");
	driver.findElement(By.cssSelector(".sc-iwsKbI.jTMXri.cursorPointing"));
		driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
		
		WebElement nextMonthButton = driver.findElement(By.id("Layer_1"));
		nextMonthButton.click();
		driver.findElement(By.xpath("//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj'][2]")).click();

		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@for='dtAfter 6 pm'])[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@for='bt_AC'])[1]"))).click();
		List<WebElement> busItems=	driver.findElements(By.xpath("//div[@class='column-two p-right-10 w-30 fl']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='column-two p-right-10 w-30 fl']")));

		System.out.println("Buses count:"+ busItems.size());
		
		for(int i=0;i<busItems.size();i++) {
			 WebElement busItem=busItems.get(i);
			 
	            String busName = busItem.getText();
	            
	            WebElement busPrice = busItem.findElement(By.xpath("//div[@class='fare d-block']"));
	            String price = busPrice.getText();
	           
	            System.out.println("Bus Name: " + busName + ", Price: " + price);
	        }
		
	}
}
