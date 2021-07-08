package myTests_FirefoxBrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MainPage;

public class ContactUs {

WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:/Users//j.gutierrez.puerta//Desktop//chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:/Users/j.gutierrez.puerta/Desktop/geckodriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@Test
	//12 TERMINADO, AGREGAR CORREO NO REGISTRADO
	public void TC01_Subscribe_Newsletter_HP_V01() throws InterruptedException{
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.sendKeysNewsLetter("ab13@gmail.com");
	}
	
	@Test
	//13 TERMINADO, OK
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