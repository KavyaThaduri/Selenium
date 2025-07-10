package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stringcomparision 
{

	public static void main(String[] args) 
	{
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
       String ExpectedName = "Facebook helps you connect and share with the people in your life.";
       String ActualName = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
       System.out.println(ActualName);
       
       if ( ExpectedName .equals(ActualName))
       {
    	   System.out.println("PASS");
       }
       else
       {
    	   System.out.println("FAIL");
       } 
	}
}
