package AssignmentRadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenderRadiobutton {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("C:\\Users\\Priya\\Desktop\\Automation\\Selenium Elements-20231213T073006Z-001\\Selenium Elements\\Gender Radio  Button.html"); 
    
    driver.findElement(By.xpath("/html/body/form/input[1]")).click();

     
     
     
	}

}
