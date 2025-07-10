package practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public static WebDriver driver;
	public static File f;
	public static FileInputStream fis;
	public static Properties p;
	public static void init () throws Exception 
	
	{
		String projectRootpath = System.getProperty("user.dir");
		System.out.println(projectRootpath);
		String testresourcespath = "\\src\\test\\resources\\";
		System.out.println(testresourcespath);
		
		 f = new File(projectRootpath + testresourcespath + "\\data.properties");
		 fis = new FileInputStream(f);
		 p = new Properties();
		 p.load(fis);
		String e=  p.getProperty("amazonurl");
		System.out.println(e);
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void browserLaunch(String browser)
	{
		if(browser.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browser.equals("Firefox"))
		{
			driver = new FirefoxDriver();

		}
		else if (browser.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Enter the correct browser");
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(url);
	}

}
