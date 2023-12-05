package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(linkText="Log in")
	static WebElement link_login;
	
	@FindBy(id="Email")
	static WebElement Txtbox_Username;
	
	@FindBy(id="Password")
	static WebElement Txtbox_Password;
	
	@FindBy(xpath="//input[@value='Log in']")
	static WebElement Btn_login;
	
	public void clickLoginLink() {
		link_login.click();
	}
	
	public void enterLoginDetails() {
		Txtbox_Username.sendKeys("mnaveenkumar.mpc@gmail.com");
		Txtbox_Password.sendKeys("Naveen@123");
	}
	
	public void clickLoginsubmitButton() {
		Btn_login.click();
	}
	
}


