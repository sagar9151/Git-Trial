package pack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider; 
import org.testng.annotations.Test;

import utilities.TestUtil;

public class ZerodhaLoginExcelTestData {
	
WebDriver driver;
	
	@BeforeClass
	public void browserLaunching()
	{
		System.setProperty("webdriver.chrome.driver" , "D:\\Automation\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com"); // To Open WebPage
		driver.manage().window().maximize();
	}
	@Test(dataProvider="loginData")
	public void loginToZerodha(String username,String password,String pin) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='userid']")).clear();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='avatar']")).click();
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Change user')]")).click();
		Thread.sleep(1000);
		
	}
	@DataProvider(name="loginData")
		public Iterator<Object[]> getTestData()
		{
			ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
			return testData.iterator();
		}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
