package locator$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example9_name 
{
  public static void main(String[] args)
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("file:///C:/Html%20program/Sample9.html");
	  
	  //Enter FN
	  driver.findElement(By.name("xyz123")).sendKeys("abc");
	  
	  //Enter LN
	  driver.findElement(By.name("xyz456")).sendKeys("xyz");
  }
}
