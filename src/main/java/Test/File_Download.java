package Test;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Download 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		//To download at "All_Downloads"(Destination Location) folder location
	    String	Location=System.getProperty("user.dir")+"\\All_Downloads\\";
		
	    //This is my "default Directory" on this "Location"
	    HashMap mp=new HashMap();
	    mp.put("download.default_directory", Location);
	    
	    //Set Chrome browser Setting
	    ChromeOptions CO=new ChromeOptions();
	    CO.setExperimentalOption("prefs", mp);
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(CO);
		
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=111.0.5563.19/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//wait
		Thread.sleep(2000);
	
		
		//Click on "Microsoft Word Document, Office Open XML document"
		driver.findElement(By.xpath("//a[text()='chromedriver_win32.zip']")).click();
		
		
	}
	

}
