package BrowserPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrangeApplication {

	public static void main(String[] args) {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); // here webdriver is interface and ChromeDriver is Class
     
     driver.manage().window().maximize(); // to maximize the windows use these 3 methods
     
     driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php"); // get any link to open use get() method
     
    // WebElement un = driver.findElement(By.name("txtUserName")); // for understand purpose 
    
    // un.sendKeys("selenium"); // user id is selenium
     
     
     driver.findElement(By.name("txtUserName")).sendKeys("selenium"); // we can use directly enter user name
   
     driver.findElement(By.name("txtPassword")).sendKeys("selenium");
     
     driver.findElement(By.name("Submit")).click(); // for buttons we can click so use click method
	}

}
