package test.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentPage extends PageObject {

	@FindBy(className="MuiTypography-h6")
	private WebElement pageTitle;

	@FindBy(className="MuiDataGrid-overlay")
	private WebElement noRowsText;

	public StudentPage(WebDriver driver) {
		super(driver);
	}

	public String confirmationTitle(){
        return pageTitle.getText();
    }
	
	public String confirmationAreThereRows(){
        return noRowsText.getText();
    }
}