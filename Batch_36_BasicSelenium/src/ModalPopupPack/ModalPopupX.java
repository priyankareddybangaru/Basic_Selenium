package ModalPopupPack;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModalPopupX {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("file:///C:/Users/Priya/Desktop/Automation/Selenium%20Elements-20231213T073006Z-001/Selenium%20Elements/Model%20Popup.html"); 
     
     Thread.sleep(2000);
     
    driver.findElement(By.id("Modal")).click();
    
    Thread.sleep(1000);
   
    driver.switchTo().activeElement(); // used to navigate modal popup
    
    Thread.sleep(2000);
    
    driver.findElement(By.className("close")).click();
    
    
    
	}

}
