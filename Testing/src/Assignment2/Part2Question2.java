//Before running this program script here enter your details
package Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2Question2 {

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
        //search box
		WebElement searchBox = driver
				.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
        //entering detail in search box
		searchBox.sendKeys("iphone x");
		//submitting box
		searchBox.submit();
        //finding product
		WebElement product = driver.findElement(By.linkText("Apple iPhone 14 Pro (256 GB) - Deep Purple"));
		product.click();
		//product title
		String title = product.getText();
		System.out.println(title);
		System.out.println("Title of product is: " + title);
        //main window 
		String mainWindowHandle = driver.getWindowHandle();
		// Switch to the new window
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(mainWindowHandle)) {
				driver.switchTo().window(handle);
				break;
			}
		}
        //add to cart button
		WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		addToCartButton.click();
		driver.findElement(By
				.xpath("/html/body/div[10]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input"))
				.click();
        //verify product added or not
		WebElement cartProduct = driver.findElement(By.xpath("//span[contains(text(), '" + title + "')]"));
		if (cartProduct != null) {
			System.out.println("Product added to cart successfully.");
		} else {
			System.out.println("Product not added to cart.");
		}          
		driver.findElement(By.xpath(
				" /html/body/div[1]/div[2]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span/span/span/input"))
				.click();
		//Before running this program script here enter your details  
		driver.findElement(By.id("ap_email")).sendKeys("your phone or email");
		
		driver.findElement(By.id("continue")).click();
		//Before running this program script here enter your details
		driver.findElement(By.id("ap_password")).sendKeys("Your password");
	
		driver.findElement(By.id("signInSubmit")).click();

		driver.findElement(By.linkText("Add a new address")).click();
		
		driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Your Name");

		driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("0123456789");

		driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("012345");

		driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("Addressline");

		driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("Addressline2");

		driver.findElement(By.id("address-ui-widgets-landmark")).sendKeys("near landmark");

		driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("your city");

	    driver.quit();

	}

}
