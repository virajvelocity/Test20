package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload 
{
	
	public static void main(String[] args) throws AWTException 
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.manage().window().maximize();
		
		//Click "select PDF file" button
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		
		        //OR Click "select PDF file" button(If above click method does not work)
	//WebElement button=driver.findElement(By.xpath("//a[@id='pickfiles']"));
	//((JavascriptExecutor)driver).executeScript("arguments[0].click()",button);
	
		//Step-I: Copy File from PC(i.e Control + C)/Copy to clipboard		
		StringSelection S1=new StringSelection("D:\\Notes\\Java.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(S1, null);
		
		//Step-II: Paste(Press "Control" key + Press "V" key)
		Robot rb1=new Robot();
		//wait
		rb1.delay(2000);
		
		//Press "Control" key and Press "V" key
		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);
		
		//Release "Control" key and Release "V" key
		rb1.keyRelease(KeyEvent.VK_CONTROL);
		rb1.keyRelease(KeyEvent.VK_V);
		
		//Step-III:Press ENTER Key
		rb1.keyPress(KeyEvent.VK_ENTER);
		//Release "ENTER" Key 
		rb1.keyRelease(KeyEvent.VK_ENTER);
		
	
	}
	
}
