package myTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MainPage;

public class PageFactoryTest {

WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//j.gutierrez.puerta//Desktop//chromedriver_win32//chromedriver.exe/");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void searchDresses() throws InterruptedException {
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.searchClothes("dress");
	}
	
	@Test
	public void fillFirsAndLastName() throws InterruptedException{
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authPage = PageFactory.initElements(driver, AuthenticationPage.class);
		CreateAccountPage createAccPage = PageFactory.initElements(driver, CreateAccountPage.class);
		mainpage.openSignInPage();
		authPage.createNewAccount("edgar@h.com");
		createAccPage.fillFirstNameAndLastName("Adrian", "Vargas","123456789");
		
	}
	
	@Test
	public void testCase11() throws InterruptedException{
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authPage = PageFactory.initElements(driver, AuthenticationPage.class);
		CreateAccountPage createAccPage = PageFactory.initElements(driver, CreateAccountPage.class);
		mainpage.searchClothes("dress");
		authPage.createNewAccount("edgar@h.com");
		createAccPage.fillFirstNameAndLastName("Adrian", "Vargas","123456789");
		
	}

	@Test
	public void TC12_Contact_V1() throws InterruptedException{
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.sendKeysNewsLetter("a14@gmail.com");
	}
	
	@AfterTest
	public void endSession() {
		System.out.println("Succesfull test");
		driver.quit();
	}
}
