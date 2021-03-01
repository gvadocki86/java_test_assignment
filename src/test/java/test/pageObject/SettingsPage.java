package test.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends PageObject {

	@FindBy(className="MuiTypography-body2")
	private WebElement pageText;

	@FindBy(className="MuiButtonBase-root")
	private WebElement startButton;

	@FindBy(className="MuiTypography-caption")
	private WebElement dataImportSuccessText;

	public SettingsPage(WebDriver driver) {
		super(driver);
	}

	public String confirmationTitle(){
        return pageText.getText();
    }
	
	public void clickStartButton(){
         startButton.click();
    }
	
	public String confirmDataImportSuccess(){
        return dataImportSuccessText.getText();
    }
}