package stepDefination;

import org.testng.Assert;

import genericLib.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.RequestPasswordResetCode;

public class ResetPasswordfeature_stepDef extends BaseClass {
	RequestPasswordResetCode requestPassword=new RequestPasswordResetCode(driver);
	LoginPage loginpage=new LoginPage(driver);
	// User sends password reset request//

	@When("User lands on requestPasswordResetCode screen after clicking Forgot your password? link")
	public void user_lands_on_request_password_reset_code_screen_after_clicking_forgot_your_password_link() {
		loginpage.Click_On_ForgotPasswordLink();
		Assert.assertEquals(requestPassword.title(),"Reset Password");
		
		

	}

	@And("User enter username and clicks on Reset password button")
	public void user_enter_username_and_clicks_on_reset_password_button() {
		requestPassword.enterUserName();
		requestPassword.clickOnResetPasswordButton();

	}

	@Then("User gets Reset Password link sent successfully message")
	public void user_gets_reset_password_link_sent_successfully_message() {
		Assert.assertEquals(requestPassword.successTittle(),"Reset Password link sent successfully");

	}

	// User try to send password reset request without password//

	@And("User clicks on Reset password button without entering filling username field")
	public void user_clicks_on_reset_password_button_without_entering_filling_username_field() {
		requestPassword.clickOnResetPasswordButton();

	}

	@Then("User gets error message for username field")
	public void user_gets_error_message_for_username_field() {
		Assert.assertEquals(requestPassword.UsernameTextboxError(),"Required");

	}
	// User cancel password reset request//

	@When("User clicks on cancel button")
	public void user_clicks_on_cancel_button() {
		requestPassword.clickOnCancelButton();

	}

	@Then("User lands on login screen.")
	public void user_lands_on_login_screen() {
		Assert.assertEquals(loginpage.pageTitle(),"OrangeHRM");

	}

}
