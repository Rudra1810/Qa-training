//Before running this program script here enter your details
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

public class Part2Question1 {

	public static void main(String[] args) throws InterruptedException {
		//setup webdrivers
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//explicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//maximize window
		driver.manage().window().maximize();
		//maximize window
		driver.get("https://www.amazon.in/");
		//signin 
		driver.findElement(By.linkText("Sign in")).click();
		//Before running this program script here enter your details
		driver.findElement(By.id("ap_email")).sendKeys("rudrabhatiya967@gmail.com");

		driver.findElement(By.id("continue")).click();
		//Before running this program script here enter your details
		driver.findElement(By.id("ap_password")).sendKeys("Rudra@1810");
		
		driver.findElement(By.id("signInSubmit")).click();

		WebElement userNameElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		if (userNameElement.isDisplayed()) {
			System.out.println("User logged in successfully.");
		} else {
			System.out.println("Login failed.");
		}
		// Locate the element to hover over
		WebElement elementToHover = driver.findElement(By.id("nav-link-accountList")); 

		// Create an instance of Actions class
		Actions actions = new Actions(driver);
		// Perform the hover action
		actions.moveToElement(elementToHover).perform();
        //clicking signout
		driver.findElement(By.linkText("Sign Out")).click();	
		// Verify successful logout by checking if the "Sign in" link is present
		WebElement signInLink = driver.findElement(By.className("a-spacing-small"));
		if (signInLink.isDisplayed()) {
			System.out.println("User logged out successfully.");
		} else {
			System.out.println("Logout failed.");
		}
        //stops driver
		driver.quit();
	}

}
