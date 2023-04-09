package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQa extends CommonMethods {

    @FindBy(xpath = "//div[@class='card-body'][1]")
    public WebElement element;

    @FindBy(xpath = "(//span[@class ='text'])[1]")
    public WebElement textbox;

    @FindBy(css = "input#userName")
    public WebElement fullName;

    @FindBy(css = "input#userEmail")
    public WebElement userEmail;

    @FindBy(css = "textarea#currentAddress")
    public WebElement currentAddress;

    @FindBy (css = "textarea#permanentAddress")
    public WebElement permanentAddress;

    @FindBy (css = "button#submit")
    public WebElement submitBtn;

    @FindBy(css = "p#name")
    public WebElement name;

    public DemoQa(){
        PageFactory.initElements(driver, this);
    }
}
