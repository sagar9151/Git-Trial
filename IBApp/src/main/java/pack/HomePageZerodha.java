package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageZerodha {
	
	@FindBy (xpath="//input[@id='userid']")
	private WebElement userID;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath="//button[contains(text(),'Login')]")
	private WebElement login;
	
	@FindBy (xpath="//input[@id='pin']")
	private WebElement pin;
	
	@FindBy (xpath="//button[contains(text(),'Continue')]")
	private WebElement Continue;
	
	@FindBy (xpath="//li[contains(text(),'5')]")
	private WebElement page5;
	
	@FindBy (xpath="//input[@id='search-input']")
	private WebElement inputName;
	
	@FindBy (xpath="(//span[text()='HDFC'])[1]")
	private WebElement clickOnShare;
	
	@FindBy (xpath="//button[contains(text(),'B ')]")
	private WebElement buy;
	
	@FindBy (xpath="//label[text()='Regular']")
	private WebElement regularOrder;
	
	@FindBy (xpath="//label[text()='Intraday ']")
	private WebElement intraday;
	
	@FindBy (xpath="(//input[@type='number'])[1]")
	private WebElement quantity;
	
	@FindBy (xpath="//label[contains(text(),'Market')]")
	private WebElement selectMarketPrice;
	
	@FindBy (xpath="//label[contains(text(),'Limit')]")
	private WebElement selectLimitPrice;
	
	@FindBy (xpath="//label[contains(text(),'SL')]")
	private WebElement selectStopLossPrice;
	
	@FindBy (xpath="//label[contains(text(),'SL-M')]")
	private WebElement selectStopLossMarketPrice;
	
	@FindBy (xpath="(//input[@type='number'])[2]")
	private WebElement price;
	
	@FindBy (xpath="(//input[@type='number'])[3]")
	private WebElement triggerPrice;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement finalBuy;
	
	@FindBy (xpath="//span[@class='icon icon-times close']")
	private WebElement error;
	
	@FindBy (xpath="//button[contains(text(),'Cancel')]")
	private WebElement cancel;
	
	public HomePageZerodha(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserID()
	{
		userID.sendKeys("XK3826");
	}
	public void sendPassword()
	{
		password.sendKeys("mayu9151");
	}
	public void clickOnLoginButton()
	{
		login.click();
	}
	public void sendPin()
	{
		pin.sendKeys("155115");
	}
	public void clickonContinueButton()
	{
		Continue.click();
	}
	public void searchShare()
	{
		inputName.sendKeys("HDFC");
	}
	public void moveToPage5()
	{
		page5.click();
	}
	public void clickOnShare()
	{
		clickOnShare.click();
	}
	public void clickOnBuy() throws InterruptedException
	{
		buy.click();
		intraday.click();
		regularOrder.click();
		quantity.clear();
		quantity.sendKeys("100");
		selectMarketPrice.click();
		finalBuy.click();
		Thread.sleep(2000);
		error.click();
//		cancel.click();
		selectLimitPrice.click();
		price.clear();
		price.sendKeys("250");
		finalBuy.click();
		selectStopLossPrice.click();
		triggerPrice.clear();
		triggerPrice.clear();
		triggerPrice.sendKeys("205");
		finalBuy.click();
		selectStopLossMarketPrice.click();
		triggerPrice.clear();
		triggerPrice.sendKeys("205");
		finalBuy.click();
	}
	public void buyAtMarketPrice()
	{
		buy.click();
		intraday.click();
		regularOrder.click();
		quantity.clear();
		quantity.sendKeys("100");
		selectMarketPrice.click();
		finalBuy.click();
		error.click();
	}
	public void buyAtLimitPrice()
	{
		buy.click();
		intraday.click();
		regularOrder.click();
		quantity.clear();
		quantity.sendKeys("100");
		selectLimitPrice.click();
		price.clear();
		price.sendKeys("250");
		finalBuy.click();
		error.click();
	}
	public void buyAtStopLossLimitPrice()
	{
		buy.click();
		intraday.click();
		regularOrder.click();
		quantity.clear();
		quantity.sendKeys("100");
		selectStopLossPrice.click();
		triggerPrice.clear();
		triggerPrice.clear();
		triggerPrice.sendKeys("205");
		finalBuy.click();
		error.click();
	}
	public void buyAtStopLossMarketPrice()
	{
		buy.click();
		intraday.click();
		regularOrder.click();
		quantity.clear();
		quantity.sendKeys("100");
		selectStopLossMarketPrice.click();
		triggerPrice.clear();
		triggerPrice.sendKeys("205");
		finalBuy.click();
		error.click();
	}
}


