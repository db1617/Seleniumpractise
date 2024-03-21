package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon210324 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium2021\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobilephones");
driver.findElement(By.id("nav-search-submit-button")).click();
driver.findElement(By.partialLinkText("Apple iPhone 13")).click();
ArrayList <String> tabs= new ArrayList <String>(driver.getWindowHandles());

driver.switchTo().window(tabs.get(1));
//driver.findElement(By.xpath("//li[@id='size_name_0']")).click();
Thread.sleep(30000);
driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//span[@id='submit.add-to-cart']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//span[@id='attach-sidesheet-checkout-button']")).click();






	

}}
