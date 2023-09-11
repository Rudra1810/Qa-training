package Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part1Question3 {

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
        //getting product title for verification
		WebElement product = driver.findElement(By.linkText("Apple iPhone 14 Pro (256 GB) - Deep Purple"));
		product.click();
		String title = product.getText();
		System.out.println(title);
		System.out.println("Title of product is: " + title);
		// Store the current window handle (main window)
		String mainWindowHandle = driver.getWindowHandle();
		// Switch to the new window
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(mainWindowHandle)) {
				driver.switchTo().window(handle);
				break;
			}
		}
        //Add to cart option
		WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		addToCartButton.click();
        
		driver.findElement(By
				.xpath("/html/body/div[10]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input"))
				.click();
        //verification
		WebElement cartProduct = driver.findElement(By.xpath("//span[contains(text(), '" + title + "')]"));
		if (cartProduct != null) {
			System.out.println("Product added to cart successfully.");
		} else {
			System.out.println("Product not added to cart.");
		}
        //deleting from cart
		WebElement deleteButton = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[3]/div[5]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/div[1]/span[2]/span/input"));
		deleteButton.click();
        //empty cart message
		WebElement emptyCartMessage = driver
				.findElement(By.xpath("//h1[contains(text(), 'Your Amazon Cart is empty')]"));
		if (emptyCartMessage != null) {
			System.out.println("Product removed from cart successfully.");
		} else {
			System.out.println("Product removal from cart failed.");
		}
        //closing driver
		driver.quit();

	}

}
