package stepDefination;

import org.testng.Assert;

import genericLib.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Loginfeature_stepDef extends BaseClass{
	
	LoginPage loginPage=new LoginPage(driver);
	
	@Given("User navigate to OrangeHRM Login screen")
	public void user_navigate_to_orange_hrm_login_screen() {
		String s=loginPage.pageTitle();
	    Assert.assertEquals(s,"OrangeHRM");
	    
	}
	@When("User Enter valid  username {string} and password {string}")
	public void user_enter_valid_username_and_password(String username, String password) {
	    loginPage.enter_username(username);
	    loginPage.enter_password(password);
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
		
		loginPage.click_on_logIn_button();
	}

	@Then("User navigate to home screen")
	public void user_navigate_to_home_screen() {
	    
	}

/////
	@When("User enter {string} username and {string} password")
	public void user_enter_username_and_password(String username, String password) {
	   loginPage.enter_username(username);
	   loginPage.enter_password(password);
	}

	@Then("User gives error message")
	public void user_gives_error_message() {
		Assert.assertEquals(loginPage.invalidCredError(), "Invalid credentials");
	    
	}
	
	////
	@Then("User gives error message at username and password textbox")
	public void user_gives_error_message_at_username_and_password_textbox() {
		Assert.assertEquals(loginPage.usernameErrortext(),"Required");
		Assert.assertEquals(loginPage.usernameErrortext(), "Required");
	    
	}




}
