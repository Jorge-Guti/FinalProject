package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DressesPage {

	final WebDriver driver;
	
	public DressesPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Search Results elements
	@FindBy(id="selectProductSort")
	WebElement sortByDropdown;
	
	@FindBy(xpath="//*[@id=\"list\"]/a")
	WebElement listButton;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[2]")
	WebElement quickViewButton;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a")
	WebElement dressItem;
	
	@FindBy(xpath="//*[@id='color_15']")
	WebElement greenColor;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div/div[2]/div[2]/ul/li[1]")
	WebElement whiteColor;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	WebElement checkoutButton1;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement checkoutButton2;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[7]/div/a/i")
	WebElement deleteButton;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/h5/a")
	WebElement printedSummerDress1;
	
	@FindBy(id="group_1")
	WebElement dressSizeDropdown;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button")
	WebElement dressAddToCart;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement dressProceedToCheckout;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement purchaseProceedToCheckout;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button")
	WebElement addressProceedToCheckout;
	
	@FindBy(xpath="//*[@id=\"cgv\"]")
	WebElement termsOfServiceCheckbox;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button")
	WebElement shippingProceedToCheckout;
	
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement payByBankButton;
	
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button")
	WebElement confirmOrderButton;
	
	
	public void sortBy(String option) throws InterruptedException{
		sortByDropdown.click();
		Thread.sleep(3000);
		sortByDropdown = driver.findElement(By.xpath("//*[@id=\"selectProductSort\"]"));
		Select select = new Select(sortByDropdown);
		select.selectByVisibleText(option);
		Thread.sleep(3000);
	}
	
	public void dressQuickView() throws InterruptedException{
		dressItem.click();
		Thread.sleep(3000);		
		greenColor.click();
		Thread.sleep(5000);
	}
	
	//Adrian, #6
	public void addAndDeleteProductToCart() throws InterruptedException {
		listButton.click();
		Thread.sleep(3000);
		whiteColor.click();
		Thread.sleep(3000);
		checkoutButton1.click();
		Thread.sleep(3000);
		checkoutButton2.click();
		Thread.sleep(3000);
		deleteButton.click();
		Thread.sleep(3000);
	}
	
	//Luis, #11
	public void selectPrintedSummerDress1() throws InterruptedException {
		printedSummerDress1.click();
		Thread.sleep(3000);
	}
	
	public void selectSize(String size) throws InterruptedException {
		dressSizeDropdown.click();
		Thread.sleep(3000);
		dressSizeDropdown = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
		Select select = new Select(dressSizeDropdown);
		select.selectByVisibleText(size);
		Thread.sleep(3000);
	}
	
	public void addToCartDress() throws InterruptedException {
		dressAddToCart.click();
		Thread.sleep(3000);
	}
	
	public void dressProceedToCheckout() throws InterruptedException {
		dressProceedToCheckout.click();
		Thread.sleep(3000);
		purchaseProceedToCheckout.click();
		Thread.sleep(3000);
		addressProceedToCheckout.click();
		Thread.sleep(3000);
		termsOfServiceCheckbox.click();
		Thread.sleep(3000);
		shippingProceedToCheckout.click();
		Thread.sleep(3000);
	}
	
	public void confirmAndPay() throws InterruptedException {
		payByBankButton.click();
		Thread.sleep(3000);
		confirmOrderButton.click();
		Thread.sleep(6000);
	}
}