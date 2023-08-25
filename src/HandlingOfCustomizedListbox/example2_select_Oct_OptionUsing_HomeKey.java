package HandlingOfCustomizedListbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class example2_select_Oct_OptionUsing_HomeKey 
{
 public static void main(String[] args) throws InterruptedException 
 {
  WebDriver driver=new EdgeDriver();
  driver.get("https://www.facebook.com/");
  
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
  
  //step1:
  WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
  
  //step2: 
  Actions act=new Actions(driver);
  
  //step3:
  act.click(month).perform();
  Thread.sleep(3000);
  
  //navigate to 1st option using "Home" key
  act.sendKeys(Keys.HOME).perform();
  Thread.sleep(3000);
  
  //step navigate to OCT option using "Arrow_Down" Key
  for(int i=1; i<=9; i++)
  {
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  Thread.sleep(2000);
  }
  
  //step4c: select option using "Enter" Key
  act.sendKeys(Keys.ENTER).perform();
}
}
