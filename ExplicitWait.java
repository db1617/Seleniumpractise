package Explicitwait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//Declaring the explicit wait 
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
//Usage
WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
username.sendKeys("Admin");
WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
password.sendKeys("admin123");
	}

}
