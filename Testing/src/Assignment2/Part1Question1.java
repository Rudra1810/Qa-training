package Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part1Question1 {

	public static void main(String[] args) throws InterruptedException {
		//set up webdrivers
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//maximize window
		driver.manage().window().maximize();
        //open the website
		driver.get("https://www.amazon.in/");
        //start registration
		driver.findElement(By.linkText("Start here.")).click();
        //sending data
		driver.findElement(By.id("ap_customer_name")).sendKeys("Rudra Bhatiya");
		driver.findElement(By.id("ap_phone_number")).sendKeys("0123456789");
		driver.findElement(By.id("ap_email")).sendKeys("example1@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("p@ssword");

		driver.findElement(By.id("continue")).click();
        //closing driver
		driver.quit();
	}

}
