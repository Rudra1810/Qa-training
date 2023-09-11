package Project;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Services3 {
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
		driver.get("https://therapdevapp.promactinfo.xyz/login");
		// signin process
		// email
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("darshanrana.edu41@gmail.com");
		// password
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Darshan@123");
		// submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		// country code
		driver.findElement(By.xpath("(//span[@type='button'])[1]")).click();

		// service1

		// driver.findElement(By.xpath("")).click();
		WebElement dropdownElement = driver.findElement(By.name("serviceName"));

		// Create a Select object to interact with the dropdown
		Select dropdown = new Select(dropdownElement);

		// Select the option by visible text
		dropdown.selectByVisibleText("service1 - Clinic");
		
		driver.findElement(By.xpath("//input[@value='multiple']")).click();

		// Locate the dropdown element by its name attribute
		WebElement dropdownElement1 = driver.findElement(By.name("patientName"));

		Select dropdown1 = new Select(dropdownElement1);

		dropdown1.selectByVisibleText("MarkfFHGer Ottoaehs");
        //meeting type
		WebElement dropdownElement2 = driver.findElement(By.name("meetingType"));

		Select dropdown2 = new Select(dropdownElement2);

		dropdown2.selectByVisibleText("Clinic");

		// date
		driver.findElement(By.xpath("(//input[@placeholder='Select Date'])[1]")).click();
		driver.findElement(By.xpath("(//td[@class='ng-tns-c117-1 ng-star-inserted'])[10]")).click();

		
		// Locate the input element by its attributes
		WebElement timeInput = driver.findElement(By.cssSelector("input[formcontrolname='time']"));

		// Execute JavaScript to set the time value
		String script = "arguments[0].value = '04:15 AM';"; // Modify this value to your desired time
		((JavascriptExecutor) driver).executeScript(script, timeInput);
		
	    driver.findElement(By.xpath("//input[@value='everyWeek']")).click();

		
		
		driver.findElement(By.xpath("//input[@class='ng-tns-c117-3 p-inputtext p-component ng-star-inserted']")).click();
		
		//frequency every week
		
		driver.findElement(By.xpath("//button[@class=\"border-0 f4 rounded-circle ms-1 day-button bg-light\"]")).click();
		driver.findElement(By.xpath("(//button[@class='border-0 f4 rounded-circle ms-1 day-button bg-light'])[2]")).click();
		driver.findElement(By.xpath("(//input[@placeholder=\"Select Date\"])[3]")).click();
		driver.findElement(By.xpath("(//span[@draggable=\"false\"])[20]")).click();
		
		//message
		WebElement textareaElement = driver.findElement(By.xpath("//textarea[@formcontrolname='message']"));
		textareaElement.click();
		textareaElement.sendKeys("first appointments");

		WebElement updateButton = driver.findElement(By.xpath("(//input[@value=\"UPDATE\"])[1]"));

		// Execute JavaScript to click the button
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", updateButton);

//		driver.quit();
	}
}
