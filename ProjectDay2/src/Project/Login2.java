package Project;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\"
			+ "chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.linkText("Sign in")).click();
//	driver.findElement(By.id("ap_email")).sendKeys("rudrabhatiya967@gmail.com");
//	driver.findElement(By.id("continue")).click();
//	driver.findElement(By.id("ap_password")).sendKeys("Rudra@1810");
//	driver.findElement(By.id("signInSubmit")).click();
//	WebElement userNameElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
//	if (userNameElement.isDisplayed()) {
//		System.out.println("User logged in successfully.");
//	} else {
//		System.out.println("Login failed.");
//	}
}
}
