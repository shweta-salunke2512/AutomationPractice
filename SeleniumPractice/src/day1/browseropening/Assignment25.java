package day1.browseropening;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment25 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='https://www.ecatering.irctc.co.in/']")).click();
		String homeWinId = driver.getWindowHandle();

		Set<String> allWinIds = driver.getWindowHandles();
		allWinIds.remove(homeWinId);

		Iterator<String> itr = allWinIds.iterator();
		String childWinId = itr.next();
		// now move control to child window
		driver.switchTo().window(childWinId);
		System.out.println("Ecatering title: " + driver.getTitle());
	driver.findElement(By.xpath("(//div[@class='relative w-full'])[1]")).click();
driver.findElement(By.cssSelector("input[placeholder='Start typing Nagpur, NGP, Rajdhani']")).sendKeys("12627");
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".body-3.h-10.w-full.px-4.text-left.leading-relaxed.text-gray-60")));
inputField.click();
	WebElement date=	driver.findElement(By.cssSelector("input[placeholder='Boarding Date']"));
		date.click();
		for (int i = 0; i < 5; i++) {
		date.sendKeys(Keys.ARROW_DOWN); 
		}
			date.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			//option[value='ET']
			driver.findElement(By.cssSelector("select[placeholder='Boarding Station']")).click();
			driver.findElement(By.cssSelector("option[value='ET']")).click();
			driver.findElement(By.cssSelector(".btn-primary.w-full")).click();
			
			 List<WebElement> restaurantNames = driver.findElements(By.cssSelector("h5[class='tracking-normal ']"));
		        for (WebElement restaurantName : restaurantNames) {
		            System.out.println(restaurantName.getText());
		        }
		            driver.switchTo().window(homeWinId);
		            System.out.println("Etrail title: "+driver.getTitle());
		            driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		            driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("Pune");
		            driver.findElement(By.xpath("//div[@title='Pune Jn']//div[1]")).click();
		            driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		            driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("Bangalore East");
		            driver.findElement(By.xpath("//div[@title='Bangalore East']//div[1]")).click();
		            driver.findElement(By.cssSelector("input[title='Select Departure date for availability']")).click();
		            
		            driver.findElement(By.xpath("//td[text()='Apr-24']"));
		           		  driver.findElement(By.xpath("//td[contains(@onclick, 'DoDateSelect(1712169000000)')]")).click();              
		                driver.findElements(By.cssSelector("#buttonFromTo"));
		                
		                List<WebElement> trainNames=driver.findElements(By.cssSelector("a[style$='color:#8B4513']"));
		                for (WebElement trainName : trainNames) {
				            System.out.println("Train names : "+trainName.getText());
				        }
		            }
		    		
		        }


