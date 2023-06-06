package locator$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_Tagname 
{
 public static void main(String[] args)
 {
	 WebDriver driver=new ChromeDriver();
	 driver.get("file:///C:/Html%20program/Sample6.html");
	 
	 //Enter FN
	driver.findElement(By.tagName("input")).sendKeys("abc");
	
	//Enter LN
	driver.findElement(By.tagName("input")).sendKeys("xyz");	
 }
}

