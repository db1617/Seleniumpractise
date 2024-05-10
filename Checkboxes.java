package HandlingCheckboxes;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
driver.get("https://www.ironspider.ca/forms/checkradio.htm");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//Selecting one check box
//driver.findElement(By.xpath("//input[@value='blue']")).click();

//Finding the Total Number of check boxes
List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
System.out.println("The Total no of Checkboxes present"+" "+checkboxes.size());

//Selecting all the check boxes using normal for loop
/*for(int i=0;i<checkboxes.size();i++)
{
	checkboxes.get(i).click();
	
}*/

//Using Enhanced For loop
/*for(WebElement chkbox:checkboxes)
{
	chkbox.click();
}*/

//Selecting the last 2 check boxes
//Formula : // total Number of checkboxes-how many check boxes to be selected= starting index
//6-2= 4 ( starting index)
/*for(int i=4;i<checkboxes.size();i++)
{
	checkboxes.get(i).click();
	
}*/

//selecting first 2 check boxes 
/*for(int i=0;i<2;i++) {
	checkboxes.get(i).click();
}*/

/*for(int i=0;i<checkboxes.size();i++)
{
	if(i<2)
	{
	checkboxes.get(i).click();
	}*/

//Un checking the check boxes

for(int i=0;i<3;i++)
{
	checkboxes.get(i).click();
}

Thread.sleep(5000);

/*for(int i=0;i<checkboxes.size();i++ ) {
	if(checkboxes.get(i).isSelected())
	{
		checkboxes.get(i).click();
	}
}*/

//using enhanced for loop 

for(WebElement chkboxes:checkboxes) {
	if(chkboxes.isSelected())
		chkboxes.click();
}
}

}
