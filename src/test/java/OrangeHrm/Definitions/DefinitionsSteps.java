package OrangeHrm.Definitions;

import OrangeHrm.Pages.LoginPage;
import OrangeHrm.Pages.MyInfoPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import OrangeHrm.Steps.Conexion;
import io.cucumber.java.en.Given;


public class DefinitionsSteps {

    private WebDriver driver;
    private Conexion conexion = new Conexion();
    private LoginPage loginPage = new LoginPage(driver);
    private MyInfoPage myInfoPage = new MyInfoPage(driver);

    @Given("^abrir el navegador$")
    public void abrir_navegador() {
        this.conexion = new Conexion();
        this.driver = this.conexion.abrirNavegador();
    }

    @When("^the user fill out user (.*) and password (.*)")
    public void fillOutloguin(String userName, String password) {
        this.loginPage = new LoginPage(driver);
        this.loginPage.fillOutLogin(userName, password);
    }

    @When("^the user modifies Contact Details$")
    public void llegarAddEmployee() {
        this.myInfoPage = new MyInfoPage(driver);
        this.myInfoPage.llegarContactDetails();
    }


    @When("^the user fill out Contact Details street1(.*) and street2(.*) and city(.*) and province(.*) and Zip(.*)$")
    public void filloutContactDetails(String street1, String street2, String city, String province, String zip) {
        this.myInfoPage = new MyInfoPage(driver);
        this.myInfoPage.filloutContactDetails(street1, street2, city, province, zip);
   }

   @When("^the user searching country(.*)$")
    public void buscarCountry(String typeCountry){
       this.myInfoPage = new MyInfoPage(driver);
       this.myInfoPage.buscarCountry(typeCountry);

   }

}