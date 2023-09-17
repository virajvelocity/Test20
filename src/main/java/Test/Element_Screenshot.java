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

public class Element_Screenshot 
{
	    //Capture Screenshot of Particular Element
	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?q=redmi+note+10s&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
		
		driver.manage().window().maximize();
		
		//To capture Screenshot of Particular Element  
		WebElement Source=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		File Source1=Source.getScreenshotAs(OutputType.FILE);
		
		File Destination=new  File("D:\\11 june\\Screenshot\\.sectionScreenshot.jpg"); 
	         
	    FileHandler.copy(Source1, Destination);
		
		
		
	}
	
	
	
}
