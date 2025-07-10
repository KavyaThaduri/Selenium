package practise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThaduriKavya 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[@class= 'sc-12foipm-70 fPPRk']")).click();
		//driver.findElement(By.className("sc-12foipm-6 erPfRs")).sendKeys("Delhi (DEL)");
		WebElement e =driver.findElement(By.xpath("//p[@class= 'sc-12foipm-6 erPfRs']"));
		
		 e.click();
	       e.sendKeys("Delhi");

       // WebElement fromCity = driver.findElement(By.xpath("//input[@id='fromCity' or @placeholder='From']"));
      //  fromCity.click();
      //  fromCity.sendKeys("Delhi");

        driver.findElement(By.xpath("//ul/li[contains(text(),'Delhi')]")).click();

        WebElement toCity = driver.findElement(By.xpath("//input[@id='toCity' or @placeholder='To']"));
        toCity.clear();
        toCity.sendKeys("Hyderabad");

        driver.findElement(By.xpath("//ul/li[contains(text(),'Hyderabad')]")).click();

        LocalDate departureDate = LocalDate.now().plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateStr = formatter.format(departureDate);

        WebElement dateField = driver.findElement(By.xpath("//input[@id='departure' or @placeholder='Departure Date']"));
        dateField.click();

        
        driver.findElement(By.xpath("//td[@data-date='" + dateStr + "']")).click();

        WebElement passengerField = driver.findElement(By.xpath("//div[@id='passengerSelection']"));
        passengerField.click();

        WebElement addAdult = driver.findElement(By.xpath("//button[@id='addAdult' or contains(@aria-label,'Increase Adults')]"));
        addAdult.click(); 
        

        WebElement addChild = driver.findElement(By.xpath("//button[@id='addChild' or contains(@aria-label,'Increase Children')]"));
        addChild.click();

        WebElement donePassengers = driver.findElement(By.xpath("//button[contains(text(),'Done') or contains(text(),'Apply')]"));
        donePassengers.click();

        WebElement classDropdown = driver.findElement(By.xpath("//select[@id='travelClass']"));
        classDropdown.sendKeys("Economy");

        
        WebElement searchBtn = driver.findElement(By.xpath("//button[contains(text(),'Search') or contains(@id,'searchButton')]"));
        searchBtn.click();

        Thread.sleep(5000);



        WebElement timeFilter = driver.findElement(By.xpath("//label[contains(text(),'6 AM - 12 PM')]/preceding-sibling::input[@type='checkbox']"));
        timeFilter.click();

        Thread.sleep(2000);

        WebElement indigoFilter = driver.findElement(By.xpath("//label[contains(text(),'IndiGo')]/preceding-sibling::input[@type='checkbox']"));
        indigoFilter.click();

        Thread.sleep(1000);

        WebElement airIndiaFilter = driver.findElement(By.xpath("//label[contains(text(),'Air India')]/preceding-sibling::input[@type='checkbox']"));
        airIndiaFilter.click();

        Thread.sleep(3000);


        System.out.println("Flight Search and Filters Applied Successfully!");

        driver.quit();




 

	}

   
  
}











