package day1.browseropening;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment19 {

	public static void main(String[] args) {
		//Open facebook , validate home page, click on create account, perform folliwng operation on date, month and year - 1. visible, enable, muliselect, optioncount
		
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Home page validated successfully.");
		} else {
			System.out.println(
					"Home page validation failed. Expected title: " + expectedTitle + ", Actual title: " + actualTitle);
		}

		driver.findElement(By.partialLinkText("Create new account")).click();
		WebElement dateField = driver.findElement(By.name("birthday_day"));
		WebElement monthField = driver.findElement(By.name("birthday_month"));
		WebElement yearField = driver.findElement(By.name("birthday_year"));
		System.out.println(dateField.isEnabled());
		System.out.println(dateField.isDisplayed());
		System.out.println(monthField.isEnabled());
		System.out.println(monthField.isDisplayed());
		System.out.println(yearField.isEnabled());
		System.out.println(yearField.isDisplayed());

		// identify dropdown

		WebElement dayDropdown = driver.findElement(By.id("day"));
		// create an instance of Select class
		Select selectdayDropdown = new Select(dayDropdown);
		System.out.println("is dropdown multiselect? " + selectdayDropdown.isMultiple());
System.out.println(selectdayDropdown.getFirstSelectedOption().getText());
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select selectmonthDropdown = new Select(monthDropdown);
		System.out.println("is dropdown multiselect? " + selectmonthDropdown.isMultiple());
		System.out.println(selectmonthDropdown.getFirstSelectedOption().getText());
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select selectyearDropdown = new Select(yearDropdown);
		System.out.println("is dropdown multiselect? " + selectyearDropdown.isMultiple());
		System.out.println(selectyearDropdown.getFirstSelectedOption().getText());
		
		List<WebElement> optionList1=selectdayDropdown.getOptions();
		System.out.println("Option count in skill dropdown: "+optionList1.size());
		
		
		List<WebElement> optionList2=selectmonthDropdown.getOptions();
		System.out.println("Option count in skill dropdown: "+optionList2.size());
		
		List<WebElement> optionList3=selectyearDropdown.getOptions();
		System.out.println("Option count in skill dropdown: "+optionList3.size());

		//to select option from dropdown using any one method
		selectdayDropdown.selectByIndex(2);
		System.out.println("Option selected from index 2: "+selectdayDropdown.getFirstSelectedOption().getText());
		
		selectmonthDropdown.selectByIndex(4);
		System.out.println("Option selected from index 4: "+selectmonthDropdown.getFirstSelectedOption().getText());
		
		selectyearDropdown.selectByIndex(4);
		System.out.println("Option selected from index 4: "+selectyearDropdown.getFirstSelectedOption().getText());
	}

}
