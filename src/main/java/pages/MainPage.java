package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(id="newsletter-input")
	WebElement newsletter;
	
	//Jorge (2)
	@FindBy(xpath="//button[@name='submitNewsletter']")
	WebElement submitNL;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement dressesButton;
	
	//Adrian (1)
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]")
	WebElement women;
	
	// - - - - - - - - - - - - -- - - - - - - - 
	//Mover a DressesPage(SearchResults) (12)
	
	
	
	@FindBy(xpath="//*[@id=\"social_block\"]/ul/li[1]/a")
	WebElement facebookButton;
	
	
	
	public void searchClothes(String clothes) throws InterruptedException {
		searchBox.sendKeys(clothes);
		Thread.sleep(1000);
		searchButton.click();
	}
	
	public void goHome() throws InterruptedException {
		logoImg.click();
		Thread.sleep(1000);
	}
	
	public void openSignInPage() throws InterruptedException {
		signIn.click();
		Thread.sleep(1000);
	}
	
	//Jorge
	public void sendKeysNewsLetter(String email) throws InterruptedException {
		newsletter.sendKeys(email);
		Thread.sleep(2000);
		submitNL.click();
		Thread.sleep(2000);
	}
	
	//  (1)
	public void goWomen() throws InterruptedException {
		women.click();
		Thread.sleep(6000);
	}
	public void goDresses() throws InterruptedException {
		dressesButton.click();
		Thread.sleep(1000);
	}
	
	
	
	
	public void facebookButton() throws InterruptedException {
		facebookButton.click();
		Thread.sleep(5000);
	}
}
