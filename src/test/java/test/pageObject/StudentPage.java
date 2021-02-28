package test.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentPage extends PageObject {

	@FindBy(className="MuiTypography-h6")
	private WebElement pageTitle;

	public StudentPage(WebDriver driver) {
		super(driver);
	}

	public String confirmationTitle(){
        return pageTitle.getText();
    }
}