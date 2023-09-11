import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptingExcersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.selenium.dev/");  // Replace with the URL you want to navigate to

        // Wait for a few seconds (you might want to use explicit waits for more complex scenarios)
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
	}


