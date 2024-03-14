package day1.browseropening;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment21 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
/*open browser 
read url from property file(https://www.saucedemo.com/)
read username from screen(one by one)
read password from screen
click on login button*?*/
		
		WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);    
		
		FileInputStream fis=new FileInputStream("C:\\Users\\shwet\\eclipse-workspace\\SeleniumPractice\\src\\day1\\browseropening\\config.properties");
		 Properties prop = new Properties();
		 prop.load(fis);
		 String url = prop.getProperty("appUrl");
		
		// Open the browser and navigate to the URL
         driver.get(url);
         String expectedURL="https://www.saucedemo.com/";
 		String actualURL=driver.getCurrentUrl();
 		System.out.println("Login Page validation status: "+actualURL.equals(expectedURL));
 		String[] usernames = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user", "error_user", "visual_user"};
		
     // Loop through each username
        for (String username : usernames) {
            // Find username field and enter username
        	WebElement usernameField = driver.findElement(By.id("user-name"));
        	
     		WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("login-button"));
            usernameField.sendKeys(username);
            driver.findElement(By.id("password")).clear();
            // Enter password
            passwordField.sendKeys("secret_sauce");

            // Click on login button
            loginButton.click();
            
            if(driver.getCurrentUrl().contains("https://www.saucedemo.com/inventory.html")) {
            	  
           	driver.findElement(By.id("react-burger-menu-btn")).click();
            System.out.println("Login successful for username: " + username);
				driver.findElement(By.id("logout_sidebar_link")).click();
            }
           
            else {
            	System.out.println("Login unsuccessful for username: " + username);
            	driver.findElement(By.id("user-name")).clear();
            	driver.findElement(By.id("password")).clear();
            }
        }	             
               //close browser
      		driver.close();	
}
}

