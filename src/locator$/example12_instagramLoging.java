package locator$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example12_instagramLoging 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.instagram.com/");
	  
     Thread.sleep(2000);
      
	  //Enter UN
	  driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d'])[1]")).sendKeys("99999999999");
	  
	  //Enter PWD
	    
	//  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xyz@123");
	  
	//  Thread.sleep(4000);
	  
	  //click on login button
	//  driver.findElement(By.xpath("//div[text()='Log in']")).click();
	  }


}

  

