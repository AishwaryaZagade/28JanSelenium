package locator$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_ID 
{
 public static void main(String[] args)
 {
	 WebDriver driver=new ChromeDriver();
	 driver.get("file:///C:/Html%20program/Sample7.html");
	 
	 //Enter FN
	 driver.findElement(By.id("1234")).sendKeys("abc");
	 
	 //Enter LN
	 driver.findElement(By.id("5678")).sendKeys("xyz");
 }
}
