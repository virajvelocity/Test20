package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_FF 
{

	public static void main(String[] args)
	{
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com");
	}
	
	
	
	
	
	
	
	
}
