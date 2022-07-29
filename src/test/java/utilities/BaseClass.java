package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	
	public ConfigRead cr = new ConfigRead();
	public String url = cr.getUrl();
	public static WebDriver driver;
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", cr.getDriverPath());
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	} 
	public void tearDown() {
		driver.close();
	}

}
