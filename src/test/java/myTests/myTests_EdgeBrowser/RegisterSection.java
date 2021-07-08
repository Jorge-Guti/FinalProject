package myTests_EdgeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MainPage;

public class RegisterSection {

WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:/Users//j.gutierrez.puerta//Desktop//chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.edge.driver","C:/Users/j.gutierrez.puerta/Desktop/edgedriver_win64/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	@Test
	//1 TERMINADO, CAMBIAR CORREO
	public void TC01_UserRegister_HP_V02() throws InterruptedException{
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authPage = PageFactory.initElements(driver, AuthenticationPage.class);
		CreateAccountPage createAccPage = PageFactory.initElements(driver, CreateAccountPage.class);
		
		mainpage.openSignInPage();
		authPage.createNewAccount("oooonno@gmail.com");
		createAccPage.fillRegisterForm("Luis", 
				"Ramirez", 
				"luis1234567890", 
				"Second Avenue 756", 
				"City Name", 
				"Florida", 
				"64000", 
				"8721234567");
	}
	
	@AfterTest
	public void endSession() throws InterruptedException {
		driver.quit();
		System.out.println("Succesfull Test");
	}
}