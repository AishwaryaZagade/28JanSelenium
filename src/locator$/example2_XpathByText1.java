package locator$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_XpathByText1 
{
  public static void main(String[] args)
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	//click on forgotten pwd link
	  driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
  }
}
