package Project;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) throws InterruptedException{
	//setup webdrivers
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\"
			+ "chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//explicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//maximize window
	driver.manage().window().maximize();
	//opens amazon.in
	driver.get("https://www.amazon.in/");
	//signin process
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("ap_email")).sendKeys("rudrabhatiya967@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Rudra@1810");
	driver.findElement(By.id("signInSubmit")).click();
	//verification
	WebElement userNameElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	if (userNameElement.isDisplayed()) {
		System.out.println("User logged in successfully.");
	} else {
		System.out.println("Login failed.");
	}
	 //stops driver
	driver.quit();
}
}
