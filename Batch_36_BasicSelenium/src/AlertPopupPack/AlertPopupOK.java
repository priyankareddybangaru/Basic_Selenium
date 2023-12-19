package AlertPopupPack;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopupOK {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("file:///C:/Users/Priya/Desktop/Automation/Selenium%20Elements-20231213T073006Z-001/Selenium%20Elements/Alert%20Message.html"); 
     
     Thread.sleep(3000);
     
    driver.findElement(By.xpath("/html/body/button")).click();
    
    Alert Al = driver.switchTo().alert();
    
    String s = Al.getText();
    
    System.out.println(s);
    
    Thread.sleep(3000);
    
    Al.accept(); // by using this method button ok will click
   
    
    
	}

}
