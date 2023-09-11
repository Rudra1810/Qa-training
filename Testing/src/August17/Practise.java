package August17;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
	     
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	   
	    driver.manage().window().maximize();//maximize window
	       
	    driver.get("https://www.selenium.dev/selenium/web/web-form.html");
	    
	    String str=driver.getTitle();
	    System.out.println("Title of a page is "+str);
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	    
	    WebElement textBox=driver.findElement(By.xpath("(//input[@class=\"form-control\"])[1]"));
	    textBox.sendKeys("Rudra");
	    
	    WebElement password=driver.findElement(By.xpath("//input[@autocomplete=\"off\"]"));
	    password.sendKeys("p@ssword");
	    
	    WebElement textarea=driver.findElement(By.xpath(" //textarea[@class=\"form-control\"]"));
	    textarea.sendKeys("hi this page is automated page");
	    
	    Select dropdown = new Select(driver.findElement(By.xpath("//select[@class=\"form-select\"]")));
	    dropdown.selectByIndex(1);
	    
	    driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("NEW YORK");
	    
	    //WebElement datalist = driver.findElement(By.xpath("(//option"));
	  //input[@type='file']
	    //driver.findElement(By.xpath("//input[@type='file']")).sendKeys("Practise.java");
	    Thread.sleep(2000);
	       
	    driver.quit();
	}

}
