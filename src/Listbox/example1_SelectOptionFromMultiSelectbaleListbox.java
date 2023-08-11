package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_SelectOptionFromMultiSelectbaleListbox 
{
 public static void main(String[] args)
 {
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("file:///C:/Html%20program/Sample11.html");
	 
	 //step1:
	 WebElement SelectCountry=driver.findElement(By.xpath("//select[@id='1234']"));
	 
	 //step2:
	 Select s=new Select(SelectCountry);
	 
	 //step3:
	 s.selectByVisibleText("Australia");
   // s.selectByVisibleText("India");
   //s.selectByValue("");
	 s.selectByIndex(0);
	 
 }
}
