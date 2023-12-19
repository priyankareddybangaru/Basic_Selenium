package Assignments;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModalPopupW3X {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_modal"); 
     Thread.sleep(1000);
     
     
     driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
     
     driver.findElement(By.id("myBtn")).click();
     Thread.sleep(1000);
     
      driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/span")).click();
      
    
     
      
      
     
    
	}

}
