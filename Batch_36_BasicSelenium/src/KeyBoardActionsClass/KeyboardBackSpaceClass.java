package KeyBoardActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardBackSpaceClass {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("https://www.google.com/"); 
     
     Thread.sleep(3000);
    
     driver.findElement(By.id("APjFqb")).sendKeys("Hello google how are you ");  
     
     Actions A = new Actions(driver);
     
     A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
     
     Thread.sleep(3000);
     
     A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
     
     Thread.sleep(3000);
     A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
     
     Thread.sleep(3000);
     A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
     
     Thread.sleep(3000);
     
     
	}

}
