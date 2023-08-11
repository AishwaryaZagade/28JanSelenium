package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example3_isMultiple2 
{
  public static void main(String[] args) 
  {
	  
	 	 WebDriver driver=new ChromeDriver();
	 	 
	 	 driver.get("file:///C:/Html%20program/Sample11.html");
	 	 
	 	 WebElement SelectCountry=driver.findElement(By.xpath("//select[@id='1234']"));
	 	 Select s=new Select(SelectCountry);
	 	 
	 	 boolean result = s.isMultiple();
	 	 System.out.println(result);
	 	 
	 	 if(result)
	 	 {
	 		 System.out.println("listbox is of multiselectable");
	 	 }
	 	 else
	 	 {
	 		 System.out.println("Listbox is of singleselectable");
	 	 } 	 
}
}
