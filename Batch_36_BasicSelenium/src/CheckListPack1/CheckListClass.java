package CheckListPack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckListClass {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
     WebDriver driver = new ChromeDriver(); 
     
     driver.manage().window().maximize(); 
     
     driver.get("C:\\Users\\Priya\\Desktop\\Automation\\Selenium Elements-20231213T073006Z-001\\Selenium Elements\\Country Name.Htm"); 
    
     WebElement checklist = driver.findElement(By.id("CheckList")); // reach to the link 
     
     List<WebElement> allcountrys     =  driver.findElements(By.tagName("option")); // find how many elements is there in that list 
    
     System.out.println("The total no.of countries is : " +allcountrys.size());
     
     Select S = new Select(checklist); // checklist is a webelement variable, by using Select class we can select multiple countries
     
     Thread.sleep(3000);
     
     S.selectByIndex(29); // based on indext we can select a country name
     
     S.selectByIndex(21);
     
     S.selectByVisibleText(" Brazil");
     
     S.selectByVisibleText(" Germany");
     
     
     
     
     
	}

}
