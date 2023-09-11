package August15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
        
        // Switching to the first iframe that contains the package details
        driver.switchTo().frame("packageListFrame");
        
        // Finding and clicking the link
        driver.findElement(By.linkText("org.openqa.selenium")).click();
        
        driver.switchTo().defaultContent();
        
        // Switching to the second iframe by index (assuming it's the 2nd iframe on the page)
        driver.switchTo().frame(1);
        
       driver.findElement(By.linkText("WebDriver")).click();
       
       
       driver.switchTo().defaultContent();
       
       // Switching to the second iframe by index (assuming it's the 2nd iframe on the page)
       driver.switchTo().frame(2);
       
      driver.findElement(By.linkText("HELP")).click();
       
       

    }
}

