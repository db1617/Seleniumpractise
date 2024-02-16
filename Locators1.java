package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium2021\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		// Id and name locators
		//driver.findElement(By.id("search_query_top")).sendKeys("T-shirts"); // this is one way
		WebElement search = driver.findElement(By.id("search_query_top"));
		search.sendKeys("T-shirts"); // This another way here we are using variable name search and performing the action
		//driver.findElement(By.name("submit_search"));
		WebElement clickelement = driver.findElement(By.name("submit_search"));
		clickelement.click();
		
		//Link Text and partial Link Text
		
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Chiffon Dress")).click();
		
	}

}
