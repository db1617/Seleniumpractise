package ConditionalMethods;
import org.openqa.selenium.By;
// Conditional Commands
/*
 * isSelected() 
 * isDisplayed()
 * isEnabled()
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		// isDisplayed 
		WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("The logo is displayed or not:"+" "+logo.isDisplayed()); // true
		
		// isEnabled()
		//WebElement searchbox = driver.findElement(By.id("small-searchterms"));
		Boolean searchbox=driver.findElement(By.id("small-searchterms")).isDisplayed();
		System.out.println(searchbox); // true
		//System.out.println(searchbox.isEnabled()); // true
		Boolean searchboxenabledstatus=driver.findElement(By.id("small-searchterms")).isEnabled();
		System.out.println(searchboxenabledstatus); // true 
		
		/*// isSelected() 
		//Before selection
		
		WebElement maleradiobutton = driver.findElement(By.id("gender-male"));
		System.out.println(maleradiobutton.isSelected()); // false
		WebElement femaleradiobutton = driver.findElement(By.id("gender-female"));
		System.out.println(femaleradiobutton.isSelected()); // false 
		
		// After Selection : male
		
		WebElement maleselect = driver.findElement(By.id("gender-male"));
		maleselect.click();
		System.out.println(maleselect.isSelected());// true 
		WebElement femaleselect = driver.findElement(By.id("gender-female"));
		System.out.println(femaleselect.isSelected()); // false 
		
		//After Selection : female 
		femaleselect.click();
		System.out.println(femaleselect.isSelected());// true
		System.out.println(maleselect.isSelected()); // false  */
		
		
		
	}

}
