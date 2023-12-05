package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.LoginPage;

public class LoginStepDef {
	
	WebDriver driver;
	SharedStep s;
	LoginPage l;
	
	public LoginStepDef(SharedStep s) {
		this.s=s;
	}

@Given("I am on Demowebshop home page")
public void i_am_on_demowebshop_home_page() {
	driver = s.getdriver();
    l = PageFactory.initElements(driver, LoginPage.class);
    driver.get("http://demowebshop.tricentis.com/");

}

@When("I click on Login")
public void i_click_on_login() {
	
		l.clickLoginLink();

}

@When("I enter username and password")
public void i_enter_username_and_password() {
		l.enterLoginDetails();

}

@Then("I click on Login submit button")
public void i_click_on_login_submit_button() {
	l.clickLoginsubmitButton();
}

}
