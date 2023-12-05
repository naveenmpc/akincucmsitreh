package steps;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pagefactory.Searchpage;

public class SearchStepDef {
	
	WebDriver driver;
	SharedStep s;
	Searchpage sp;
	
	public SearchStepDef(SharedStep s) {
		this.s=s;
	}
	
	@Given("I am on Search page of demowebshop")
	public void i_am_on_search_page_of_demowebshop() {
		driver = s.getdriver();
	    sp = PageFactory.initElements(driver, Searchpage.class);
	    driver.get("http://demowebshop.tricentis.com/");
	    sp.ClickLoginLink();
	}

	@When("I search the product")
	public void i_search_the_product() {
		sp.ClickOnComputers();
	}

	@When("I click on Add to cart")
	public void i_click_on_add_to_cart() {
		sp.add_to_cart();
	}

	@Then("I click on Logout")
	public void i_click_on_logout() {
		sp.log_out();
	}
}
