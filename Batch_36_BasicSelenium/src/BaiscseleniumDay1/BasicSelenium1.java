package BaiscseleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver WD = new ChromeDriver();
		
		WD.manage().window().maximize();
		
		WD.get("https://mail.google.com/mail/");
		
		WD.get("https://www.facebook.com/");
		

	}

}
