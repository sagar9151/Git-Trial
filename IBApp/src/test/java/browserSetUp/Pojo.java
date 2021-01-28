package browserSetUp;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pojo {
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "src"+File.separator+"test"+File.separator+"resources"+File.separator+"Browser"+File.separator+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	public static WebDriver openFireFoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "src"+File.separator+"test"+File.separator+"resources"+File.separator+"Browser"+File.separator+"geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
