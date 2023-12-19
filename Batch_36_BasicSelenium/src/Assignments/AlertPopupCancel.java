package Assignments;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopupCancel {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm"); 
     
     driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
     
      driver.findElement(By.xpath("/html/body/button")).click();
      Thread.sleep(1000);
    
      Alert A = driver.switchTo().alert();
      
      String s = A.getText();
      
      System.out.println(s);
      
      
      Thread.sleep(1000);
      
      
     A.dismiss();
    
	}

}
