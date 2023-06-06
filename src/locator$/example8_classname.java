package locator$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_classname 
{
 public static void main(String[] args)
 {
	 WebDriver driver=new ChromeDriver();
	 driver.get("file:///C:/Html%20program/Sample8.html");
	 
	 //Enter FN
	 driver.findElement(By.className("abc123")).sendKeys("abc");
	 
	 //Enter LN
	 driver.findElement(By.className("abc456")).sendKeys("xyz");
 }
}
