package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchingToFrames 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("kavya");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Software");
		
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Automation");

		WebElement innerFrame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(innerFrame);

		driver.findElement(By.xpath("//span[text()='Hi, I am the UI.Vision IDE']")).click();
		driver.findElement(By.xpath("//span[text()='Web Testing']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='e2CuFe eU809d']"));
		dropdown.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
 		WebElement option =	driver.findElement(By.xpath("//div[@role='option']//span[@class='vRMGwf oJeWuf'][normalize-space()='Well, now I know :-)']"));
	    js.executeScript("arguments[0].click();", option);
		option .click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Hello");
		driver.findElement(By.xpath("//textarea[@class='KHxj8b tL9Q4c']")).sendKeys("This is Kavya");
		driver.findElement(By.xpath("//span[text()='Submit']")).click();

		driver.switchTo().defaultContent();
				
	    WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
	    driver.switchTo().frame(frame4);
	    driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Testing");

	}
}
