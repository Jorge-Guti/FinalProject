package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

	final WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="search_query_top")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@name='submit_search']")
	WebElement searchButton;
	
	@FindBy(xpath="//img[@alt='My Store']")
	WebElement logoImg;
	
	@FindBy(xpath="//a[@class='login']")
	WebElement signIn;
	
	public void searchClothes(String clothes) throws InterruptedException {
		searchBox.sendKeys(clothes);
		Thread.sleep(1000);
		searchButton.click();
		Thread.sleep(3000);
	}
	
	public void goHome() throws InterruptedException {
		logoImg.click();
		Thread.sleep(1000);
	}
	
	public void openSignInPage() throws InterruptedException {
		signIn.click();
		Thread.sleep(1000);
	}
	
	
}
