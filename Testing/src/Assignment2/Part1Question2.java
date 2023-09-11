package Assignment2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part1Question2 {

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
        //search product box
		WebElement searchBox = driver
				.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
        //entering product name
		searchBox.sendKeys("iphone x");
		//searching using submit
		searchBox.submit();
        //getting title for verification
		WebElement product = driver.findElement(By.linkText("Apple iPhone 14 Pro (256 GB) - Deep Purple"));
		product.click();
		String title = product.getText();
		System.out.println(title);
		System.out.println("Title of product is: " + title);
		driver.quit();

	}

}
