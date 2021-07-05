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
		System.setProperty("webdriver.chrome.driver","C:/Users/c.salazar.sauceda/Documents/chromedriver.exe");
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
		createAccPage.fillFirstNameAndLastName("Cassandra", "Salazar","123456789");
		
	}
	
	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
