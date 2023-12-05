package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Searchpage {
	
	@FindBy(linkText="Log in")
	static WebElement loginpage;
	
	@FindBy(id="Email")
	static WebElement Txt_Username;
	
	@FindBy(id="Password")
	static WebElement Txt_Password;
	
	@FindBy(xpath="//input[@value='Log in']")
	static WebElement Bttn_login;
	
     @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[2]/a")
	static WebElement computers;
	
@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[2]/ul/li[1]/a")
	static WebElement desktops;
	
	@FindBy(xpath="//*[@id=\"products-orderby\"]")
	static WebElement productsOrderBy;
	
	@FindBy(xpath="//*[@id=\"products-pagesize\"]")
	static WebElement productsPagesize;
	
	@FindBy(xpath="//*[@id=\"products-viewmode\"]")
	static WebElement productsViewmode;
	
@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div[2]/ul/li[2]/a")
	static WebElement Price;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/div[2]/input")
	static WebElement AddtoCart;
	
	@FindBy(linkText="Log out")
	static WebElement logout;
	
	public void ClickLoginLink() {
		loginpage.click();
		Txt_Username.sendKeys("mnaveenkumar.mpc@gmail.com");
		Txt_Password.sendKeys("Naveen@123");
		Bttn_login.click();
	}
	
	public void ClickOnComputers() {
		computers.click();
		desktops.click();
		Select dd = new Select(productsOrderBy);
		dd.selectByIndex(4);
		Select ds = new Select(productsPagesize);
		ds.selectByIndex(1);
		Select dr = new Select(productsViewmode);
		ds.selectByIndex(0);
		Price.click();
	}
	
	public void add_to_cart() {
		AddtoCart.click();
	}
	
	public void log_out() {
		logout.click();
	}
}

