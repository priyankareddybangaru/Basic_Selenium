package RobotClassPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass2 {

	public static void main(String[] args) throws InterruptedException, AWTException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php"); 
     
    
     driver.findElement(By.name("txtUserName")).sendKeys("selenium");  // dirver.findElement() is a WebElement 
     
     driver.findElement(By.name("txtPassword")).sendKeys("selenium");
     
     driver.findElement(By.name("Submit")).click(); 
     
      // System.out.println("After login Title is: " +driver.getTitle());
     
     Thread.sleep(3000);
    
    Actions A = new Actions(driver);
    
    A.moveToElement(driver.findElement(By.id("pim"))).perform();
    
    Thread.sleep(2500);
    
    driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
    
    Thread.sleep(1500);
    
    driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
    
    driver.findElement(By.name("txtEmployeeId")).clear();
    
    driver.findElement(By.name("txtEmployeeId")).sendKeys("EMP104228");
    
    driver.findElement(By.name("txtEmpLastName")).sendKeys("Bangaru");
    
    driver.findElement(By.name("txtEmpFirstName")).sendKeys("Priyaaa");
    
    driver.findElement(By.name("txtEmpMiddleName")).sendKeys("Reddy");
    
    driver.findElement(By.name("txtEmpNickName")).sendKeys("Ammu");
    
    Thread.sleep(3000);
    
   A.moveToElement(driver.findElement(By.name("photofile"))).click().perform();
   
   Thread.sleep(1000);
   
   StringSelection SS = new StringSelection("C:\\Users\\Priya\\Pictures\\Saved Pictures\\Defect1.PNG"); // it is a class and string is our file 
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null); // for COPY the location
   
           Thread.sleep(1000);
  
         Robot R = new Robot();
   
       R.keyPress(KeyEvent.VK_CONTROL);
       R.keyPress(KeyEvent.VK_V);
       
       R.keyRelease(KeyEvent.VK_CONTROL);
       R.keyRelease(KeyEvent.VK_V);
       
    
       
       R.keyPress(KeyEvent.VK_ENTER);
       R.keyRelease(KeyEvent.VK_ENTER);
       
       Thread.sleep(2000);
       
     driver.findElement(By.id("btnEdit")).click();
 
     Thread.sleep(2000);
   
    driver.findElement(By.className("backbutton")).click();
    
   Thread.sleep(1000);
   
   driver.switchTo().defaultContent();
   Thread.sleep(1000);
   
   A.moveToElement(driver.findElement(By.id("pim"))).perform();
   
   Thread.sleep(2500);
   
   driver.switchTo().defaultContent();
   
     
   driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
   
	}

}
