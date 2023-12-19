package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxClass2 {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("C:\\Users\\Priya\\Desktop\\Automation\\Selenium Elements-20231213T073006Z-001\\Selenium Elements\\Country Check box.html"); 
    
   
     List <WebElement> allcheckbox     =  driver.findElements(By.tagName("input"));
     
    // System.out.println("select all the check boxes is "  +allcheckbox.size());
     
     for(int x = 1; x<=allcheckbox.size(); x++)
     {
     	
     
    	 driver.findElement(By.xpath("/html/body/form/input["+x+"]")).click();
     
	}
	}
}
