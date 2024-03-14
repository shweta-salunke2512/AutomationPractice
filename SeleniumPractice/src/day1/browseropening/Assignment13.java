package day1.browseropening;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoblaze.com/");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
		driver.manage().window().maximize();
		List<WebElement> devicesList=driver.findElements(By.cssSelector("#tbodyid>div>div"));
		System.out.println("Device count:"+ devicesList.size());
		
	
		for(int i=0;i<devicesList.size();i++)
		{
				WebElement device=devicesList.get(i);
				
				WebElement deviceNameElement = device.findElement(By.cssSelector("h4>a"));
			String deviceName=deviceNameElement.getText();
			
			// Get the corresponding price for the current device
            WebElement devicePriceElement = device.findElement(By.cssSelector("h5"));
            String price = devicePriceElement.getText();
	            System.out.println("Device name: " + deviceName + ", Price: " + price);
			
		}
		
		
		
	}

}
