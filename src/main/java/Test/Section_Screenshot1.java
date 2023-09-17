package Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Section_Screenshot1
{
	//Capture Screenshot of Particular Section
	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?q=redmi+note+10s&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
		
		driver.manage().window().maximize();
		
		//To capture section of Screenshot
	WebElement Source=driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[1]"));
		
	File Source1=Source.getScreenshotAs(OutputType.FILE);
		
	File Destination=new  File("D:\\11 june\\Screenshot\\.sectionScreenshot.jpg"); 
	         
	FileHandler.copy(Source1, Destination);
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
