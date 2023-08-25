package ScrollUpDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class example1_ScrollUpDown 
{
 public static void main(String[] args) throws InterruptedException 
 {
  WebDriver driver=new EdgeDriver();
  driver.get("https://www.facebook.com/");
  driver.manage().window().maximize();
  
  Thread.sleep(3000);
  
  //scroll down :-> 1st parameter: 0, 2nd parameter: +Ve pixel value
  ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
  
  Thread.sleep(3000);
  
  //scroll up :-> 1st parameter: 0, 2nd parameter: -Ve pixel value
  ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
   
//  //scroll right :-> 1st parameter: +Ve, 2nd parameter: 0
//  ((JavascriptExecutor)driver).executeScript("window.scrollBy(100,0)");
//  
//  //scroll left :-> 1st parameter: -Ve, 2nd parameter: 0
//  ((JavascriptExecutor)driver).executeScript("window.scrollBy(-50,0)");
}
}
