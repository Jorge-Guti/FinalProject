package myTests_ChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MainPage;
import pages.DressesPage;

public class AllTestsPageFactory {

WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:/Users//j.gutierrez.puerta//Desktop//chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:/Users//j.gutierrez.puerta//Desktop//chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	@Test
	//1 TERMINADO, PEND DE REV
	public void TC01_UserRegister_HP_V02() throws InterruptedException{
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authPage = PageFactory.initElements(driver, AuthenticationPage.class);
		CreateAccountPage createAccPage = PageFactory.initElements(driver, CreateAccountPage.class);
		
		mainpage.openSignInPage();
		authPage.createNewAccount("onorooo@gmail.com");
		createAccPage.fillRegisterForm("Luis", 
				"Ramirez", 
				"luis1234567890", 
				"Second Avenue 756", 
				"City Name", 
				"Texas", 
				"64000", 
				"8721234567");
	}
	
	@Test
	//2 TERMINADO, OK
	public void TC01_SignIn_HP_V02() throws InterruptedException {
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authpage = PageFactory.initElements(driver, AuthenticationPage.class);
		
		mainpage.openSignInPage();
		authpage.signIn("testcase11@gmail.com", "123456789");
	}
	
	@Test
	//3 TERMINADO, OK
	public void TC01_SearchExistenItem_HP_V02() throws InterruptedException {
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		DressesPage dressespage = PageFactory.initElements(driver, DressesPage.class);
		
		mainpage.searchClothes("dress");
		dressespage.sortBy("Price: Lowest first");
		dressespage.dressQuickView();
		mainpage.goHome();
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
	//11 TERMINADO
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
	
	@Test
	//12 TERMINADO, AGREGAR CORREO NO REGISTRADO
	public void TC01_Subscribe_Newsletter_HP_V01() throws InterruptedException{
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.sendKeysNewsLetter("a1bn4@gmail.com");
	}
	
	@Test
	//13 TERMINADO
	public void TC01_Follow_Facebook_HP_V01() throws InterruptedException{
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		
		mainpage.facebookButton();
	}
	
	
	@AfterTest
	public void endSession() throws InterruptedException {
		driver.quit();
		System.out.println("Succesfull Test");
	}
}
