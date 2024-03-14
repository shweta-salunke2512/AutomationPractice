package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");		
System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		
		String expectedURL="https://www.facebook.com/";
		String actualURL=driver.getCurrentUrl();
		System.out.println("URL validation status: "+actualURL.equals(expectedURL));
			
		//close browser
		driver.close();	
	}

}
