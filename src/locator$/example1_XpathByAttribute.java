package locator$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_XpathByAttribute 
{
  public static void main(String[] args) throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	//enter UN
	//driver.findElement("Locator type")
	//driver.findElement(By.xpath("xpathExpression"));
	  
  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9999999999");
   
  Thread.sleep(2000);
  
  //Enter PWD
    
  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
  
  Thread.sleep(2000);
  
  //click on login button
  driver.findElement(By.xpath("//button[@name='login']")).click();
  }
}
