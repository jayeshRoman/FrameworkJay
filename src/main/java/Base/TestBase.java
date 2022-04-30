package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	
	public static WebDriver driver;
	public Properties prop;
	
	public TestBase() throws IOException
	{
		 prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\jayesh\\eclipse-workspace\\FrameworkJay\\Config\\Config1.properties");
		prop.load(file);
	}
	
	public void initialization() throws IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayesh\\eclipse-workspace\\FrameworkJay\\chromedriver.exe");
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
		
		driver.get(prop.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		}
}
