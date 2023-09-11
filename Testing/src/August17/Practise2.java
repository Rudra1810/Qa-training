package August17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise2 {

    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("laptops");
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
      
     
       // driver.findElement(By.xpath("(//div[@class=\"_2kHMtA\"])[3]"));
       
        Thread.sleep(2000);
      }
}