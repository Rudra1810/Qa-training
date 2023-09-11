package Project;
 import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Negative7 {
	public static void main(String[] args) throws InterruptedException {
		// setup webdrivers
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\" + "chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// explicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// maximize window
		driver.manage().window().maximize();
		// opens amazon.in
		driver.get("https://therapdevapp.promactinfo.xyz/therapist/signup");
		// signup process
		// select Mr.
		By dropdownLocator = By.cssSelector("select[formcontrolname='nameTitle']");
		WebElement dropdownElement = driver.findElement(dropdownLocator);
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByValue("Mr");
		// first name
		driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("Rudra1810");
		// lastname
		driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("Bhatiya");
		// email
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("abc123@gmail.com");
		// password
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Rudra@1810120011");
		// reenter pass
		driver.findElement(By.xpath("//input[@formcontrolname='rePassword']")).sendKeys("Rudra@1810120011");
		// country code
		driver.findElement(By.xpath("//input[@formcontrolname='countryCode']")).sendKeys("1234");
		// phone no.
		driver.findElement(By.xpath("//input[@formcontrolname='phoneNumber']")).sendKeys("1234567891234567");
	    //scroll page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        //address
		driver.findElement(By.xpath("//input[@formcontrolname='address']")).sendKeys("my street 1");
		WebElement errorMessageElement = driver.findElement(By.xpath("//span[@class=\"text-danger error-font\"]"));
        if (errorMessageElement.isDisplayed()) {
           String errorMessage = errorMessageElement.getText();
           System.out.println("Error Message: " + errorMessage);
       } else {
           System.out.println("No error message found.");
      }
		
		
		driver.quit();
	}
}