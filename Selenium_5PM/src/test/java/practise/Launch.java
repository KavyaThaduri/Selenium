package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch
{
	public static void main( String[]args)

	{
	WebDriver driver;
	 driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 
	 
	 
	 driver = new FirefoxDriver();
	 driver.navigate().to("https://www.flipkart.com");


}
}