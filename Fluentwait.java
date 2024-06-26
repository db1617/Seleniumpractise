package Fluentwait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//Fluent Wait 
		//Declaration 
		FluentWait mywait = new FluentWait(driver);
		mywait.withTimeout(Duration.ofSeconds(30));
		mywait.pollingEvery(Duration.ofSeconds(5));
		mywait.ignoring(NoSuchElementException.class);
		
		//Usage 
		
		WebElement username=(WebElement)mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
username.sendKeys("Admin");
WebElement password = (WebElement)mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
password.sendKeys("admin123");	
	
	}

}
