package Assignment2;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class Part2Question3 {

	public static void main(String[] args) throws InterruptedException {
		//setting up crome webdriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//maximize window
		driver.manage().window().maximize();
        //open the link
		driver.get("https://www.amazon.in/");
        //sign in button
		driver.findElement(By.linkText("Sign in")).click();
		// Intentionally using invalid credentials
		driver.findElement(By.id("ap_email")).sendKeys("invalid@123.com"); 

		driver.findElement(By.id("continue")).click();
		;
        //verification and error message
		WebElement errorElement = driver.findElement(By.id("auth-error-message-box"));
		if (errorElement.isDisplayed()) {
			String errorMessage = errorElement.getText();
			System.out.println("Login failed. Error message: " + errorMessage + " enter valid email details");
		} else {
			System.out.println("Login succeeded unexpectedly.");
		}

		driver.quit();
	}
}
