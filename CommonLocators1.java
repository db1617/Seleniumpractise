package Seleniumnew1;

//import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonLocators1 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		// These above 2 statements will open the browser 
		// this Driver instance will access all the methods in the webdriver 
driver.get("http://www.automationpractice.pl/index.php");
driver.manage().window().maximize();
driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
driver.findElement(By.name("submit_search")).click();
//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
driver.findElement(By.partialLinkText("Chiffon Dress")).click();
Thread.sleep(5000);
driver.close();
	}

}
