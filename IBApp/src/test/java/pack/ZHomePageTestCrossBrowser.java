package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browserSetUp.Pojo;


public class ZHomePageTestCrossBrowser extends Pojo {
	
WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser)throws Exception 
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
		driver = openChromeBrowser();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
		driver = openFireFoxBrowser();
		}
		driver.get("https://kite.zerodha.com"); // To Open WebPage
		driver.manage().window().maximize();
	}
//	@BeforeClass
//	public void browserLaunching()
//	{
//		System.setProperty("webdriver.chrome.driver" , "D:\\Automation\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://kite.zerodha.com"); // To Open WebPage
//		driver.manage().window().maximize();
//	}
	@BeforeMethod
	public void userDetails() throws InterruptedException
	{
		ZerodhaLogin loginPage = new ZerodhaLogin(driver);
		loginPage.sendUserID();
		loginPage.sendPassword();
		loginPage.clickOnLoginButton();
		Thread.sleep(2000);
		loginPage.sendPin();
//		Thread.sleep(2000);
		loginPage.clickonContinueButton();
	}
	@Test
	public void buyShare_RegularOrder_Intraday_MarketLimitSLSLM() throws InterruptedException
	{
		HomePageZerodha homePage = new HomePageZerodha(driver);
		Thread.sleep(7000);
		homePage.searchShare();
//		homePage.moveToPage5();
		Thread.sleep(1000);
		homePage.clickOnShare();
		Thread.sleep(2000);
		homePage.clickOnBuy();
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		ZerodhaLogin loginPage = new ZerodhaLogin(driver);
		Thread.sleep(9000);
		loginPage.clickOnAccount();
		loginPage.clickOnLogout();
	}
//	@AfterClass
//	public void closeBrowser()
//	{
//		driver.quit();
//	}
	@AfterTest
	public void closeBrowser()	
	{
		driver.quit();
	}
	
	

}
