package practise;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kavya 
{

	public static void main(String[] args) throws Exception 
	{
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.goibibo.com/");
			
			driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
			driver.findElement(By.xpath("//span[@class= 'sc-12foipm-70 fPPRk']")).click();
			
			WebElement from = driver.findElement(By.xpath("//span[text()='From']"));
			from.click();
			//from.sendKeys("Delhi (DEL)");
			
			WebElement fromInput = driver.findElement(By.xpath("//input[@type='text']"));

	        fromInput.sendKeys("New Delhi (DEL)");
			WebElement option = driver.findElement((By.xpath("(//span[@class='autoCompleteSubTitle'])[1]")));

	      //Click on Enter
	        
			Robot rb = new Robot();

			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		    
		    
		    

	        
			
			//WebElement option = driver.findElement((By.xpath("(//span[@class='autoCompleteSubTitle'])[1]")));
			//option.click();
		

	

	}
}
