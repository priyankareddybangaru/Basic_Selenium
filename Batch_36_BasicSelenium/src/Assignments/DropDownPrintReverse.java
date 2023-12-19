package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownPrintReverse {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php"); 
     
    
     driver.findElement(By.name("txtUserName")).sendKeys("selenium");  // dirver.findElement() is a WebElement 
     
     driver.findElement(By.name("txtPassword")).sendKeys("selenium");
     
     driver.findElement(By.name("Submit")).click(); 
     
     driver.switchTo().frame(driver.findElement(By.id("rightMenu"))); 
     
     WebElement dd = driver.findElement(By.id("loc_code"));
     
    List<WebElement> ddelements  = dd.findElements(By.tagName("option")); 
    
    System.out.println("The total no.of Elements present in the Dropdown is: " +ddelements.size());
    
    for(int x=ddelements.size()-1 ;x>=0 ; x--) // logic for print elements in reverse order
    {
    	System.out.println(ddelements.get(x).getText());
    }
     
	}

}
