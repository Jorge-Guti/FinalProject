package myTests_ChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MainPage;
import pages.DressesPage;

public class SearchBar {

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
	//3 TERMINADO, OK
	public void TC01_SearchExistenItem_HP_V02() throws InterruptedException {
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		DressesPage dressespage = PageFactory.initElements(driver, DressesPage.class);
		
		mainpage.searchClothes("dress");
		dressespage.sortBy("Price: Lowest first");
		dressespage.dressQuickView();
		mainpage.goHome();
	}
	
	@AfterTest
	public void endSession() throws InterruptedException {
		driver.quit();
		System.out.println("Succesfull Test");
	}
}
