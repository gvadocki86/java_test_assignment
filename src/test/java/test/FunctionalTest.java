package test;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
//import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver;//.Options;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunctionalTest {
	protected static WebDriver driver;
	//protected static Options option;

	@BeforeAll
	public static void setUp(){
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//option = new FirefoxOption();
		//option.timeouts.implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterEach
    public void cleanUp(){
        //option.deleteAllCookies();
		driver.manage().deleteAllCookies();
    }

    @AfterAll
    public static void tearDown(){
        driver.close();
    }
}