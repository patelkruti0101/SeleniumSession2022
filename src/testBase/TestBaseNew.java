package testBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseNew {
	
	public static WebDriver driver;
	
	public static WebDriver getInstance() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
		
		
	}
	

}
