package test;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import test.pageObject.SettingsPage;

public class SettingsPageTest extends FunctionalTest {

	@Test
	public void checkPageText(){	//Checks if the text on settings page is the same as the controll-compare value.
		driver.get("localhost:3000/settings");
		
		SettingsPage settingsPage = new SettingsPage(driver);
		
		Assertions.assertEquals("Inject demo content in the backend. Run this command only once!", settingsPage.confirmationTitle());
	}	
}