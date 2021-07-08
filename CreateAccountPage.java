package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {

	final WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="id_gender1")
	WebElement mrRadio;
	
	@FindBy(id="id_gender2")
	WebElement mrsRadio;
	
	@FindBy(id="customer_firstname")
	WebElement firstNameTextBox;
	
	@FindBy(id="customer_lastname")
	WebElement lastNameTextBox;
	
	@FindBy(id="email")
	WebElement emailTextBox;
	
	@FindBy(id="passwd")
	WebElement passwordTextBox;
	
	@FindBy(id="days")
	WebElement dayDropdown;
	
	@FindBy(id="months")
	WebElement monthDropdown;
	
	@FindBy(id="years")
	WebElement yearDropdown;
	
	@FindBy(id="newsletter")
	WebElement signUpForNewsletterCheckBox;
	
	@FindBy(id="optin")
	WebElement receiveSpecialCheckBox;
	
	@FindBy(id="firstname")
	WebElement addressFirstNameTextBox;
	
	@FindBy(id="lastname")
	WebElement addressLastNameTextBox;
	
	@FindBy(id="company")
	WebElement companyTextBox;
	
	@FindBy(id="address1") 
	WebElement addressTextBox;
	
	@FindBy(id="address2")
	WebElement address2TextBox;
	
	@FindBy(id="city")
	WebElement cityTextBox;
	
	@FindBy(id="id_state")
	WebElement stateDropdown;
	
	@FindBy(id="postcode")
	WebElement zipCodeTextBox;
	
	@FindBy(name="id_country")
	WebElement countryDropdown;
	
	@FindBy(id="other")
	WebElement additionalInfoTextBox;
	
	@FindBy(id="phone")
	WebElement homePhoneTextBox;
	
	@FindBy(id="phone_mobile")
	WebElement mobilePhoneTextBox;
	
	@FindBy(id="alias")
	WebElement addressAliasTextBox;
	
	@FindBy(id="submitAccount")
	WebElement registerButton;
	
	public void fillFirstNameAndLastName(String firstName, String lastName, String password) throws InterruptedException{
		mrRadio.click();
		Thread.sleep(2000);
		firstNameTextBox.sendKeys(firstName);
		Thread.sleep(2000);
		lastNameTextBox.sendKeys(lastName);
		Thread.sleep(2000);
		passwordTextBox.sendKeys(password);
		Thread.sleep(2000);

	}
	
	
}
