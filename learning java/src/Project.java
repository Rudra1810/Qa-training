


//script to check the websites name
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
		     
			 
		        
		        // Initialize a ChromeDriver instance
		        WebDriver driver = (WebDriver) new ChromeDriver();
		   
		    driver.manage().window().maximize();//maximize window
		       
		    //step1 open website
		    driver.get("https://www.selenium.dev/");
		    
		    //step2 checking name
		    String title=driver.getTitle();
		    
		    if("Selenium".equals(title)){
		    	System.out.println("Title matched, test case passed");
		    }
		    else {
		    	System.out.println("Title not matched, test case failed");
		    }
		    
		    //step3 close website
		    //driver.close(); //closes window which webdriver is currently focuses on
		    driver.quit(); //closes all the process window and tab opened by driver
		    
	}

}

