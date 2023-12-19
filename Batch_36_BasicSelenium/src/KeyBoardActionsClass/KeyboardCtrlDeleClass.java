package KeyBoardActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardCtrlDeleClass {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("https://www.google.com/"); 
     
     Thread.sleep(3000);
    
     driver.findElement(By.id("APjFqb")).sendKeys("Hello google how are you ");  
     
     Thread.sleep(3000);
     
     Actions A = new Actions(driver);
     
     A.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
     Thread.sleep(3000);
     
     A.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
     
     Thread.sleep(3000);
     
     driver.findElement(By.id("APjFqb")).sendKeys("Hey i am fine  "); 
     
     Thread.sleep(3000);
     
     A.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
     Thread.sleep(3000);
     
     A.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform();
     
      Thread.sleep(3000);
     
     A.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
     
     
     
	}

}
