package Seleniumnew1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CSSselectorlocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");
driver.manage().window().maximize();

//tag and ID
//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Desktop");
//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Desktop");

//tag and class

//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Desktop");
//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Desktop");

//tag and attribute

//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Desktop");
//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Mobile");

//Tag class and attribute 

//driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("Mobile");
driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("Laptop");
	}

}
