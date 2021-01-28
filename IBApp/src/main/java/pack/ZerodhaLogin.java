package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLogin {
	
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
	
	@FindBy (xpath="//div[@class='avatar']")
	private WebElement account;
	
	@FindBy (xpath="//a[@target='_self']")
	private WebElement logout;
	
	public ZerodhaLogin(WebDriver driver)
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
	public void clickOnAccount()
	{
		account.click();
	}
	public void clickOnLogout()
	{
		logout.click();
	}

}
