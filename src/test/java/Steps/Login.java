package Steps;

import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login extends CommonMethods {
    @Given("user navigates to demoqa application")
    public void user_navigates_to_demoqa_application() {
       openBrowserAndLaunchApplication();
    }
    @When("user clicks on elements")
    public void user_clicks_on_elements() {
        click(demoQa.element);
    }
    @When("user clicks on text box")
    public void user_clicks_on_text_box() {
        click(demoQa.textbox);
    }
    @When("user enters full name")
    public void user_enters_full_name() {
        sendText(demoQa.name, "Ghani");
    }
    @When("user enters email address")
    public void user_enters_email_address() {
        sendText(demoQa.userEmail, "123@gmail.com");
    }
    @When("user enters current address")
    public void user_enters_current_address() {
        sendText(demoQa.currentAddress, "123 Clayton Road");
    }
    @When("user enters permanent address")
    public void user_enters_permanent_address() {
       sendText(demoQa.permanentAddress, "321 Herat Road");
    }
    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        click(demoQa.submitBtn);
    }
    @Then("user sees the data submitted")
    public void user_sees_the_data_submitted() {
       demoQa.name.getText();
        Assert.assertEquals(demoQa.name.getText(),"Ghani");
    }
}
