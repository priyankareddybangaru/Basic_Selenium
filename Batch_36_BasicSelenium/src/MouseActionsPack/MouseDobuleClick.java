package MouseActionsPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDobuleClick {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("file:///C:/Users/Priya/Desktop/Automation/Selenium%20Elements-20231213T073006Z-001/Selenium%20Elements/Doubleclick.html"); 
     
    
    
     
     Thread.sleep(3000);
     
    WebElement dc = driver.findElement(By.id("demo"));
    
    Actions A = new Actions(driver); // driver is webElement 
    
    A.doubleClick(driver.findElement(By.id("demo"))).perform();
   
    
    
	}

}
