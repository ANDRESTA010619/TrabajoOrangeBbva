package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.ListsPages;
import OrangeHrm.Steps.Questions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage {

    private ButtonPages buttonPages;
    private Questions questions;
    private ListsPages listsPages;

    @FindBy(how = How.XPATH, using = "//label[text()='Street 1']//..//..//input")
    private WebElement txtStreet1;
    @FindBy(how = How.XPATH, using = "//label[text()='Street 2']//..//..//input")
    private WebElement txtStreet2;
    @FindBy(how = How.XPATH, using = "//label[text()='City']//..//..//input")
    private WebElement txtCity;
    @FindBy(how = How.XPATH, using = "//label[text()='State/Province']//..//..//input")
    private WebElement txtState;
    @FindBy(how = How.XPATH, using = "//label[text()='Zip/Postal Code']//..//..//input")
    private WebElement txtZip;

    public MyInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);
        this.listsPages = new ListsPages(driver);
    }

    public void llegarContactDetails() {
        this.buttonPages.btnMyInfo();
        this.buttonPages.setBtnContactDetails();

    }

    public void filloutContactDetails(String street1, String street2, String city, String province, String zip) {
        this.txtStreet1.isDisplayed();
        this.txtStreet1.clear();
        this.questions.timeSeconds(1);
        this.txtStreet1.clear();
        this.questions.timeSeconds(12);
        this.txtStreet1.clear();
        this.questions.timeSeconds(2);
        this.txtStreet2.clear();
        this.txtStreet1.sendKeys(street1);
        this.txtStreet2.clear();
        this.txtStreet2.sendKeys(street2);
        this.txtCity.clear();
        this.txtCity.sendKeys(city);
        this.txtState.clear();
        this.txtState.sendKeys(province);
        this.txtZip.clear();
        this.txtZip.sendKeys(zip);
    }


    public void buscarCountry(String typeCountry) {
        questions.timeSeconds(1);
        listsPages.Country(typeCountry);
        questions.timeSeconds(1);
        buttonPages.btnSave();
    }
}
