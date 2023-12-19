package MouseActionsPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragandDropClass {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("C:/Users/Priya/Desktop/Automation/Selenium%20Elements-20231213T073006Z-001/Selenium%20Elements/Drag%20and%20Drop.html"); 
     
    
    
     
     Thread.sleep(3000);
     
     Actions A = new Actions(driver); // driver is webElement 
     
    WebElement sc = driver.findElement(By.id("drag1"));
    
    WebElement tr = driver.findElement(By.id("draghere"));
    
     
        A.dragAndDrop(sc, tr).perform();
   
    
    
	}

}
