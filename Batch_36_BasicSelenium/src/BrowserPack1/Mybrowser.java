package BrowserPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mybrowser {

	public static void main(String[] args) {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); // here webdriver is interface and ChromeDriver is Class
     
     driver.manage().window().maximize(); // to maximize the windows use these 3 methods
     
     driver.get("https://mail.google.com/"); // get any link to open use get() method
     

	}

}
