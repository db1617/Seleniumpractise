package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Xpathusingorand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium2021\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		// Xpath  using or and 
		
		//driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[@name='submit_search' or @class='btn btn-default button-search1']")).click();
		
		//xpath using and 
		//driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[@name='submit_search' and @class='btn btn-default button-search']")).click();
		
		//xpath using contains() method - This one is really important 
		
		//driver.findElement(By.xpath("//input[contains(@id,'search_query')]")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[contains(@name,'submit_')]")).click();
		
		//xpath using starts with() method - Both contains and starts with can be used for dynamically changing elements 
		//driver.findElement(By.xpath("//input[starts-with(@id,'search')]")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[starts-with(@name,'submit_')]")).click();
		
		//xpath using text() method 
		//driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		//Chained Xpath 
		driver.findElement(By.xpath("//form[@id='searchbox']//input[4]")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//form[@id='searchbox']//button")).click();
		
		
	}

}
