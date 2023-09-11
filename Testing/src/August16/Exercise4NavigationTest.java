package August16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise4NavigationTest
{
	public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/html/default.asp");
        Thread.sleep(1000);
       // Navigate to a different page
        driver.navigate().to("https://www.w3schools.com/css/default.asp");
        Thread.sleep(1000);
        // Navigate back to the previous page
        driver.navigate().back();
        Thread.sleep(1000);
        // Navigate forward to the next page
        driver.navigate().forward();
        Thread.sleep(1000);
        // Refresh the current page
        driver.navigate().refresh();
        Thread.sleep(1000);
        //navigate to any page
        driver.navigate().to("https://www.w3schools.com/js/default.asp");
        Thread.sleep(1000);
        //navigate to any page
        driver.navigate().to("https://www.w3schools.com/sql/default.asp");
        Thread.sleep(1000);
        //navigate to any page
        driver.navigate().to("https://www.w3schools.com/python/default.asp");
        Thread.sleep(1000);
        //navigate to any page
        driver.navigate().to("https://www.w3schools.com/java/default.asp");
        Thread.sleep(1000);
           
    }
}
        
        
 