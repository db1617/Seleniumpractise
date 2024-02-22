package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXpathaxes {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium2021\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	driver.manage().window().maximize();
	//self - selects the current node
String text = driver.findElement(By.xpath("(//a[contains(text(),'South Indian Ban')]/self::a)")).getText();
System.out.println(text);

//parent - selects the parent of the current node(Always one)

String text1 = driver.findElement(By.xpath("//a[contains(text(),'South Indian Ban')]/parent::td")).getText();
System.out.println(text1);

//Child - selects the children of the current node(One or many)
List<WebElement> childs =driver.findElements(By.xpath("//a[contains(text(),'South Indian Ban')]/ancestor::tr/child::td"));
System.out.println("number of childelements"+" "+childs.size());

//Ancestor - Selects all the ancestors (parent , grandparent,etc)
text1=driver.findElement(By.xpath("//a[contains(text(),'South Indian Ban')]/ancestor::tr")).getText();
System.out.println(text1);
//descendant - Selects the (children , grand children ,etc) 
List<WebElement> descendant =driver.findElements(By.xpath("//a[contains(text(),'South Indian Ban')]/ancestor::tr/descendant::*"));
System.out.println("number of descendant are"+" "+descendant.size());

Thread.sleep(10000);




driver.quit();

	}

}
