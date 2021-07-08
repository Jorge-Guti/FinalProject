package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenPage {

	final WebDriver driver;
	
	public WomenPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]")
	WebElement WomenCategory;
	
	@FindBy(xpath="//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")
	WebElement topsCategory;
	
	@FindBy(xpath="//*[@id=\"list\"]/a")
	WebElement listButton;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div/div[2]/div[2]/ul/li[1]")
	WebElement whiteColor;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	WebElement checkoutButton1;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement checkoutButton2;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[7]/div/a/i")
	WebElement deleteButton;
	
	
	
	public void addAndDeleteProductToCart() throws InterruptedException {
		listButton.click();
		Thread.sleep(6000);
		whiteColor.click();
		Thread.sleep(6000);
		checkoutButton1.click();
		Thread.sleep(6000);
		checkoutButton2.click();
		Thread.sleep(6000);
		deleteButton.click();
		Thread.sleep(6000);
	}
	
}