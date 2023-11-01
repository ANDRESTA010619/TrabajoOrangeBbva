package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private ButtonPages buttonPages;

    private Questions questions;

    // identificardor de elementos
    @FindBy(how = How.NAME, using = "username")
    //Varaible del elemento
    private WebElement user;

    @FindBy(how = How.NAME, using = "password")
    private WebElement pass;

    //Esto es un constructor
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);
    }

    //Esto es el metodo
    public void fillOutLogin(String userName, String password) {
        this.user.sendKeys(userName);
        this.pass.sendKeys(password);
        this.buttonPages.btnLogin();
        this.questions.timeSeconds(3);
        this.questions.screenShot();

    }
}
