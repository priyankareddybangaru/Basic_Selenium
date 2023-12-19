package DropDownValidation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownPrintAll {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php"); 
     
    
     driver.findElement(By.name("txtUserName")).sendKeys("selenium");  // dirver.findElement() is a WebElement 
    
     Thread.sleep(2000);
     
     driver.findElement(By.name("txtPassword")).sendKeys("selenium");
     
     Thread.sleep(2000);
     
     driver.findElement(By.name("Submit")).click(); 
     Thread.sleep(2000);
     
     driver.switchTo().frame(driver.findElement(By.id("rightMenu"))); 
     
     WebElement dd = driver.findElement(By.id("loc_code"));
     
    List<WebElement> ddelements  = dd.findElements(By.tagName("option")); 
    
    System.out.println("The total no.of Elements present in the Dropdown is: " +ddelements.size());
    
    for(int x = 0; x<ddelements.size(); x++)
    {
    	System.out.println(ddelements.get(x).getText());
    }
     
	}

}
