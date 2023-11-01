package OrangeHrm.Steps;

import OrangeHrm.Pages.MyInfoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {


    @FindBy(how = How.XPATH, using = "//button[@type = 'submit']")
    private WebElement btnLogin;
    @FindBy(how = How.XPATH, using = "//span[text()='My Info'] ")
    private WebElement btnMyInfo;
    @FindBy(how = How.XPATH, using = "//*[text() ='Contact Details']//..")
    private WebElement btnContactDetails;
    @FindBy(how = How.XPATH, using = "//button[@type = 'submit']")
    private WebElement btnSave;

    public ButtonPages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void btnLogin() {
        btnLogin.isDisplayed();
        btnLogin.click();
    }

    public void btnMyInfo() {
        btnMyInfo.isEnabled();
        btnMyInfo.click();
    }

    public void setBtnContactDetails() {
        btnContactDetails.isDisplayed();
        btnContactDetails.click();

    }

    public void btnSave() {
        btnSave.isDisplayed();
        btnSave.click();
    }
}
