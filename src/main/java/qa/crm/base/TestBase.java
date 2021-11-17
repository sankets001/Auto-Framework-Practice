package qa.crm.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	public Properties prop;
	public TestBase() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\SANKET\\eclipse-workspace0\\Automation_Framework1\\src\\main\\java\\qa\\crm\\config\\config.properties");
		prop = new Properties();
		prop.load(file);
			}
	
	public void initialization(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("URL"));
	}
}
