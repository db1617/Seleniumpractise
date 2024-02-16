package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium2021\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	int sliders = driver.findElements(By.className("homeslider-container")).size();
		System.out.println(sliders);
	int linkno	= driver.findElements(By.tagName("a")).size();
	System.out.println(linkno);
	}

}
