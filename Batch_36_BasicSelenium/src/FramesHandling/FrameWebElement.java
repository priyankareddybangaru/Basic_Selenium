package FramesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWebElement {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php"); 
     
    
     driver.findElement(By.name("txtUserName")).sendKeys("selenium");  // dirver.findElement() is a WebElement 
     
     driver.findElement(By.name("txtPassword")).sendKeys("selenium");
     
     driver.findElement(By.name("Submit")).click(); 
     
     driver.switchTo().frame(driver.findElement(By.id("rightMenu"))); // move to the frame based on WebElement or get into the frame use frame(WebElement) method
     
     WebElement dd = driver.findElement(By.id("loc_code"));
     
     driver.switchTo().defaultContent(); // come out from the frame use defaultContent() method 
     
     Thread.sleep(4000);
     
     driver.findElement(By.linkText("Logout")).click(); 
     
	}

}
