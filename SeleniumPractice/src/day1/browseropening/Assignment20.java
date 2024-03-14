package day1.browseropening;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
		driver.manage().window().maximize();
		
		WebElement yearDropdown = driver.findElement(By.id("yearbox"));
		// create an instance of Select class
		Select selectyearDropdown = new Select(yearDropdown);
		System.out.println(selectyearDropdown.getFirstSelectedOption().getText());
		selectyearDropdown.selectByIndex(4);
		System.out.println("Option selected from index 4: "+selectyearDropdown.getFirstSelectedOption().getText());
		List<WebElement> yearOptions = selectyearDropdown.getOptions();

        // Store the years in an ArrayList
        List<Integer> years = new ArrayList<>();
        for (int i = 1; i < yearOptions.size(); i++) { // Start from index 1 to skip the default placeholder option
            try {
                // Try to parse the option text to integer
                int year = Integer.parseInt(yearOptions.get(i).getText());
                years.add(year);
            } catch (NumberFormatException e) {
                // Skip the option if it's not a valid year
                continue;
            }
        }
        // Check if years are in ascending order
        boolean isAscending = true;
        for (int j = 0; j < years.size()-1; j++) {
            if (years.get(j) > years.get(j + 1)) {
                isAscending = false;
                break;
            }
        }

        // Print the result
        if (isAscending) {
            System.out.println("Years are in ascending order.");
        } else {
            System.out.println("Years are not in ascending order.");
        }
		
		
	
	}
}
