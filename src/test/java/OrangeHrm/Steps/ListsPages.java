package OrangeHrm.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListsPages {

    private WebDriver driver;
    public ListsPages (WebDriver driver){
        this.driver = driver;
    }
    public void Country(String typeCountry){
        WebElement listCountry = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']//.."));
        listCountry.click();

        WebElement selectCountry = listCountry.findElement(By.xpath("//*[text()='"+typeCountry+"']"));
        selectCountry.click();
    }
}
