package myTests_ChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;

import pages.AuthenticationPage;
import pages.MainPage;
import pages.DressesPage;

public class ShoppingCart {

WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users//j.gutierrez.puerta//Desktop//chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	

	@Test
	//6 TERMINADO, OK
	public void TC02_Add_Cart_Delete_HP_V02() throws InterruptedException {
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		DressesPage dressespage = PageFactory.initElements(driver, DressesPage.class);
		mainpage.goWomen();
		dressespage.addAndDeleteProductToCart();
	}
	
	@Test
	//11 TERMINADO, OK
	public void TC04_Add_Cart_Continue_HP_V02() throws InterruptedException{
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authpage = PageFactory.initElements(driver, AuthenticationPage.class);
		DressesPage dressespage = PageFactory.initElements(driver, DressesPage.class);
		
		mainpage.openSignInPage();
		authpage.signIn("testcase11@gmail.com", "123456789");
		mainpage.goDresses();
		
		dressespage.selectPrintedSummerDress1();
		dressespage.selectSize("M");
		dressespage.addToCartDress();
		dressespage.dressProceedToCheckout();
		dressespage.confirmAndPay();
	}

	@AfterTest
	public void endSession() throws InterruptedException {
		driver.quit();
		System.out.println("Succesfull Test");
	}
}