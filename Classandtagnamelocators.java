package Seleniumnew1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classandtagnamelocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php");
		Thread.sleep(7000);
		//To get the count of total sliders 
	List<WebElement> slider = driver.findElements(By.className("homeslider-container"));
		System.out.println("Print the no of sliders"+" "+slider.size());
		
		//To get the total count of images in the webpage
	List<WebElement>	images=driver.findElements(By.tagName("img"));
	System.out.println("Print the no of images"+" "+images.size());
	
	//To get the total no of links in the webpage
	
	List<WebElement>Links = driver.findElements(By.tagName("a"));
	System.out.println("Total no of links"+" "+Links.size());;

	}

}
