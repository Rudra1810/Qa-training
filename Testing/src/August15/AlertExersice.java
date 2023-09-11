package August15;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExersice
{

    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
   
        // Finding and clicking the link
        driver.findElement(By.linkText("See an example alert")).click();
        
        Alert alert=driver.switchTo().alert();
        
        String message=alert.getText();
        
        System.out.println("alert mesage"+message);
        
        Thread.sleep(2000);
        alert.accept();// clicks ok button
    }
}
        
        
 