import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementInteraction2 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
            driver.get("https://www.facebook.com/r.php");
            WebElement ddown =driver.findElement(By.name("birthday_day"));	
            //script for delecting dropdown 
            Select select=new Select(ddown);
            
            select.selectByValue("18");
            
            select.selectByVisibleText("18");
            
            select.selectByIndex(17);
    	    
	}

}
