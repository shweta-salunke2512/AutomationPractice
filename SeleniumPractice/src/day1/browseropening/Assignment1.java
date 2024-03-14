package day1.browseropening;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");		
System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		
		String expectedURL="https://demo.vtiger.com/vtigercrm/index.php";
		String actualURL=driver.getCurrentUrl();
		System.out.println("URL validation status: "+actualURL.equals(expectedURL));
		String pageSource=driver.getPageSource();
		System.out.println("Page source length: "+pageSource.length());
		
		//close browser
		driver.close();	
	}

}
