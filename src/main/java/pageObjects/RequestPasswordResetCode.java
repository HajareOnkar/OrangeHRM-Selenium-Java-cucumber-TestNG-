package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestPasswordResetCode {
	WebDriver driver;
	@FindBy(xpath = "//h6[contains(@class,'orangehrm-forgot-password-title')]")
	private WebElement Tittle;
	@FindBy(name = "username")
	private WebElement UsernameTB;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement ResetPasswordBtn;
	@FindBy(xpath = "//button[contains(@class,'orangehrm-forgot-password-button--cancel')]")
	private WebElement CancelBtn;
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
	private WebElement successTittle;
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement UsernameTbError;

	public RequestPasswordResetCode(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver, this);

	}

	public String title() {
		String title = Tittle.getText();
		return title;
	}
	public void enterUserName() {
		UsernameTB.sendKeys("Admin");
	}
	public void clickOnResetPasswordButton() {
		ResetPasswordBtn.click();
	}
	public void clickOnCancelButton() {
		CancelBtn.click();
	}
	public String successTittle() {
		String successTittleMessage=successTittle.getText();
		return successTittleMessage;
	}
	public String UsernameTextboxError() {
		String usernameError=UsernameTbError.getText();
		return usernameError;
		
	}

}
