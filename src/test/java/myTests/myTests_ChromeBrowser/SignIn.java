package myTests_ChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AuthenticationPage;
import pages.MainPage;

public class SignIn {

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
	//2 TERMINADO, OK
	public void TC01_SignIn_HP_V02() throws InterruptedException {
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authpage = PageFactory.initElements(driver, AuthenticationPage.class);
		
		mainpage.openSignInPage();
		authpage.signIn("testcase11@gmail.com", "123456789");
	}	
	
	@AfterTest
	public void endSession() throws InterruptedException {
		driver.quit();
		System.out.println("Succesfull Test");
	}

}