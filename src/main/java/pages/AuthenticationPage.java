package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage {

	final WebDriver driver;
	
	public AuthenticationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Create Account section elements
	@FindBy(id="email_create")
	WebElement createEmailTextBox;
	
	@FindBy(id="SubmitCreate")
	WebElement createAccountButton;
	
	//Login With Credentials elements
	@FindBy(id="email")
	WebElement emailTextBox;
	
	@FindBy(id="passwd")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//a[@title='Recover your forgotten password']")
	WebElement forgotPassword;
	
	@FindBy(id="SubmitLogin")
	WebElement signInButton;
	
	public void createNewAccount(String email) throws InterruptedException{
		createEmailTextBox.sendKeys(email);
		Thread.sleep(3000);
		createAccountButton.click();
		Thread.sleep(2000);
	}

	public void signIn(String email, String pass) throws InterruptedException {
		emailTextBox.sendKeys(email);
		Thread.sleep(1000);
		passwordTextBox.sendKeys(pass);
		Thread.sleep(1000);
		signInButton.click();
		Thread.sleep(2000);
	}
	
	
	

	
}
