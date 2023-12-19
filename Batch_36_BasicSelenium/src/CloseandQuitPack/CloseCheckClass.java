package CloseandQuitPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CloseCheckClass {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php"); 
     
    
     driver.findElement(By.name("txtUserName")).sendKeys("selenium");  // dirver.findElement() is a WebElement 
     
     driver.findElement(By.name("txtPassword")).sendKeys("selenium");
     
     driver.findElement(By.name("Submit")).click(); 
     
     System.out.println("After login Title is: " +driver.getTitle());
     
     Thread.sleep(3000);
    
    Actions A = new Actions(driver);
    
    A.moveToElement(driver.findElement(By.id("help"))).perform();
    
    Thread.sleep(1500);
    
    driver.findElement(By.xpath("//*[@id=\"help\"]/ul/li[2]/a/span")).click();
    
     Set<String> Windowscount = driver.getWindowHandles();
     
     System.out.println("The number of windows is opened :" +Windowscount.size());
     
    ArrayList<String> Al = new ArrayList<String>(Windowscount);
    
   driver.switchTo().window(Al.get(1));  // navigates to child
   
     System.out.println("After code modificication the title changes to :" +driver.getTitle() );
     
     Thread.sleep(3000);
     driver.switchTo().window(Al.get(0));  // navigates to Parent 
     
     Thread.sleep(3000);
     driver.switchTo().window(Al.get(1));
     Thread.sleep(3000);
     driver.switchTo().window(Al.get(0));
     
     Thread.sleep(1000);
     
     driver.close(); // it closes the current window
     
	}

}
