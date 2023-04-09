package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp {


    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstName;

    @FindBy(xpath="//input[@name='last_name']")
    public WebElement lastName;

    @FindBy(xpath="//input[@name='business_name']")
    public WebElement businessName;

    @FindBy(className="email input mb1")
    public WebElement Email;

    @FindBy(css="button#demo")
    public WebElement submitButton;


}
