package GetMethods;

import java.util.Set;

/* get();
 * getTitle();
 * getCurrentURL();
 * getWindowHandle();
 * getWindowHandles();
 * getPageSource();
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
/*String title= driver.getTitle();
System.out.println("the title of the page is"+" "+title);
String url=driver.getCurrentUrl();
System.out.println("the current URL of the page is"+" "+url);
System.out.println("Page source");
System.out.println(driver.getPageSource());
String headtag = driver.getPageSource();
System.out.println(headtag.contains("head"));*/

//System.out.println("Window handles of single tab"+" "+driver.getWindowHandle());
//this method will generate ID for the current tab
Thread.sleep(5000);
driver.findElement(By.linkText("OrangeHRM, Inc")).click();
Set<String> multiplewindow = driver.getWindowHandles();
System.out.println(multiplewindow);
// This will return the ID of the web page for the multiple tabs
	}

}
