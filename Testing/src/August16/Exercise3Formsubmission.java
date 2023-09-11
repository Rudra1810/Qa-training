package August16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3Formsubmission {

    public static void main(String[] args) {
      
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();

        // Open the Facebook signup page
        driver.get("https://www.facebook.com/r.php");

        try {
            // Find and fill out the form fields
            WebElement firstNameField = driver.findElement(By.name("firstname"));
            firstNameField.sendKeys("Rudra");

            WebElement lastNameField = driver.findElement(By.name("lastname"));
            lastNameField.sendKeys("Bhatiya");

            WebElement emailField = driver.findElement(By.name("reg_email__"));
            emailField.sendKeys("Rudra@example.com");
                       
            WebElement retypeEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
            retypeEmail.sendKeys("Rudra@example.com");

            WebElement passwordField = driver.findElement(By.name("reg_passwd__"));
            passwordField.sendKeys("P@ssw0rd");
            
            WebElement monthDropdown = driver.findElement(By.id("month"));
            monthDropdown.sendKeys("January");

            WebElement dayField = driver.findElement(By.id("day"));
            dayField.sendKeys("15");

            WebElement yearField = driver.findElement(By.id("year"));
            yearField.sendKeys("1990");

            WebElement genderRadio = driver.findElement(By.xpath("//input[@value='2']")); 
            genderRadio.click();
          
            WebElement signUpButton = driver.findElement(By.name("websubmit"));
            signUpButton.click();

            
           Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
