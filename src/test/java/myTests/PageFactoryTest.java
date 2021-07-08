package myTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
	public void TC12_Contact_V3() throws InterruptedException{
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.sendKeysNewsLetter("a15@gmail.com");
	}
	
	@AfterTest
	public void endSession() {
		System.out.println("Succesfull test");
		driver.quit();
	}
}
