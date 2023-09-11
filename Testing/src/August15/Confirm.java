package August15;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Confirm {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");

        // Finding and clicking the link
        driver.findElement(By.linkText("See a sample confirm")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //WebDriverWait wait = new WebDriverWait(driver, 10); // Initialize WebDriverWait

        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();

        String message = alert.getText();

        System.out.println("alert message: " + message);

        Thread.sleep(2000);
        alert.dismiss(); // clicks cancel button

        driver.quit(); // Close the browser session
    }
}
