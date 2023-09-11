package August16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
            driver.get("https://stackoverflow.com/users/login");
		    	
            //email textbox
            WebElement email=driver.findElement(By.id("email"));
            email.sendKeys("rudrabhatiya967@gmail.com");
            
            
            //password box
            WebElement password=driver.findElement(By.name("password"));
            password.sendKeys("Rudra@1810");
		    	 
            //submit-button
            driver.findElement(By.name("submit-button")).click();
             
            }
       	    
	}


