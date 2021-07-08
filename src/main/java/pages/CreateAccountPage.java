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
	
	public void fillRegisterForm (String name, 
			String lastName, 
			String pass, 
			String address, 
			String city, 
			String state, 
			String pstcode, 
			String phone) throws InterruptedException {
		mrRadio.click();
		Thread.sleep(2000);
		firstNameTextBox.sendKeys(name);
		Thread.sleep(1000);
		lastNameTextBox.sendKeys(lastName);
		Thread.sleep(1000);
		passwordTextBox.sendKeys(pass);
		Thread.sleep(2000);
		addressTextBox.sendKeys(address);
		Thread.sleep(2000);
		cityTextBox.sendKeys(city);
		Thread.sleep(2000);
		
		stateDropdown.sendKeys(state);
//		stateDropdown.click();
//		stateDropdown = driver.findElement(By.id("id_state"));
////	stateDropdown = driver.findElement(By.xpath("//*[@id=\"selectProductSort\"]"));
//		Select select = new Select(stateDropdown);
//		select.selectByVisibleText(state);
		Thread.sleep(2000);
		
		zipCodeTextBox.sendKeys(pstcode);
		Thread.sleep(2000);
		mobilePhoneTextBox.sendKeys(phone);
		Thread.sleep(2000);
		registerButton.click();
		Thread.sleep(6000);
	}
	
//	public void chooseState(String state) throws InterruptedException {
//	stateDropdown.click();
//	stateDropdown = driver.findElement(By.xpath("//*[@id=\"selectProductSort\"]"));
//	Select select = new Select(stateDropdown);
//	select.selectByVisibleText(state);
//	Thread.sleep(6000);
//}
	
//	public void fillGender() throws InterruptedException {
//		mrRadio.click();
//		Thread.sleep(2000);
//	}
//	
//	public void fillNameAndLastName (String name, String lastName) throws InterruptedException {
//		firstNameTextBox.sendKeys(name);
//		Thread.sleep(1000);
//		lastNameTextBox.sendKeys(lastName);
//		Thread.sleep(1000);
//	}
//
//	public void fillPassword(String pass) throws InterruptedException {
//		passwordTextBox.sendKeys(pass);
//		Thread.sleep(2000);
//	}
//	
//	public void fillAddress(String address) throws InterruptedException {
//		addressTextBox.sendKeys(address);
//		Thread.sleep(2000);
//	}
////	
//	public void fillCity(String city) throws InterruptedException {
//		cityTextBox.sendKeys(city);
//		Thread.sleep(2000);
//	}
	

	
//	public void fillPostalCode(String pstcode) throws InterruptedException {
//		zipCodeTextBox.sendKeys(pstcode);
//		Thread.sleep(2000);
//	}
	
//	public void fillMobPhone(String phone) throws InterruptedException {
//		mobilePhoneTextBox.sendKeys(phone);
//		Thread.sleep(2000);
//	}
//	
//	public void registerButton() throws InterruptedException {
//		cityTextBox.click();
//		Thread.sleep(2000);
//	}

}



