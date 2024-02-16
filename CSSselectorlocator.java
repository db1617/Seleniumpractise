package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorlocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium2021\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Tag and ID combination 
		
	 driver.findElement(By.cssSelector("input#email")).sendKeys("divyasai9716@gmail.com");
		//driver.findElement(By.cssSelector("#email")).sendKeys("divyasai716@gmail.com");
    
		// Tag and class Combination 
		
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("rAbbit@12");
	//driver.findElement(By.cssSelector(".inputtext")).sendKeys("Test@12"); // throwing an error
		
		// Tag and Attribute combination 
		
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("divyasai9716@gmail.com");
		//driver.findElement(By.cssSelector("[name=email]")).sendKeys(Keys.SHIFT,"divya");
		
		// Tag , class and attribute combination
		
		//driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys(Keys.SHIFT,"divya");
	driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys(Keys.SHIFT,"divya");
	driver.findElement(By.name("login")).click();
	}

}
