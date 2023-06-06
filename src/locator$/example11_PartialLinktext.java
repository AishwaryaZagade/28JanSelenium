package locator$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example11_PartialLinktext 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Html%20program/Sample10.html");
		 
		 Thread.sleep(2000);
		 
		 //Click on facebook link
		 driver.findElement(By.partialLinkText("ceb")).click();
	 }
}
