package August16;

//script to open the website and close it
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2Simpletest {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64-extract\\chromedriver-win64\\chromedriver.exe");
		     
			WebDriver driver=new ChromeDriver();
		   
		    driver.manage().window().maximize();//maximize window
		       
		    //step1 open website
		    driver.get("https://www.selenium.dev/");
		    
		    //step2 checking name
		    String title=driver.getTitle();
		    
		    System.out.println("Title of website"+title);
		   
		    Thread.sleep(2000);
		   
		    //step3 close website
		    driver.close();
		    
	}

}

