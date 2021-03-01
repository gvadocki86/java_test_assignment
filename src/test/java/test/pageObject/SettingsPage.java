package test.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends PageObject {

	@FindBy(className="MuiTypography-body2")
	private WebElement pageText;

	public SettingsPage(WebDriver driver) {
		super(driver);
	}

	public String confirmationTitle(){
        return pageText.getText();
    }
}