package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	 WebDriver driver;
	@FindBy(name="username")
	private WebElement username_tb;
	@FindBy(name="password")
	private WebElement password_tb;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login_btn;
	@FindBy(xpath="//div[@role='alert']")
	private WebElement invalidCred;
	@FindBy(xpath="//span[contains(@class,'oxd-text oxd')]")
	private WebElement usernameError;
	@FindBy(xpath="(//span[contains(@class,'oxd-text oxd')])[2]")
	private WebElement passwordError;
	@FindBy(xpath="//div[@class='orangehrm-login-forgot']")
	private WebElement ForgotPasswordLink;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	}
	
	public void enter_username(String username) {
		username_tb.sendKeys(username);
	}
	public void enter_password(String password) {
		password_tb.sendKeys(password);
	}
	public void click_on_logIn_button() {
		login_btn.click();
	}
	public String pageTitle() {
		String pagetitle=driver.getTitle();
		return pagetitle;
	}
	public String invalidCredError() {
		return invalidCred.getText();
		
	}
	public String usernameErrortext() {
		return usernameError.getText();
	}
	public String passwordErrortext() {
		return passwordError.getText();
	}
	public void Click_On_ForgotPasswordLink() {
		ForgotPasswordLink.click();
	}
	
	
	

}
