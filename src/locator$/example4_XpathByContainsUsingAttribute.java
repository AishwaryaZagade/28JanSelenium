package locator$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_XpathByContainsUsingAttribute 
{
	public static void main(String[] args)
	  {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  
	//Enter user name
		  
	driver.findElement(By.xpath("//input[contains( @placeholder,'phone number')]")).sendKeys("abc");
	
	//Enter PWD
	
	driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("xyz");
    
	//click on login btn
	
	driver.findElement(By.xpath("//button[contains(@class,'selected _51sy')]")).click();
}
}