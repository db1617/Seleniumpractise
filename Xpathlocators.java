package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocators {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Selenium2021\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.automationpractice.pl/index.php");
driver.manage().window().maximize();

// Absolute xpath 

/*driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("T-shirts");
driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();*/

// relative Xpath 
//driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-shirts");
//driver.findElement(By.xpath("//button[@name='submit_search']")).click();

 




	}

}
