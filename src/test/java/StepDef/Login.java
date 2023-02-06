package StepDef;
import Config.Env;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import ObjectRepository.PageLogin;

import static org.junit.Assert.assertTrue;
public class Login extends Env{

    PageLogin PageLogin = new PageLogin();

    @Given("User On Login Page")
    public void user_on_login_page() {
        WebElement Titlelogin = driver.findElement(PageLogin.getTitlelogin());
        Titlelogin.isDisplayed();
        assertTrue("Login Page Displayed",true);
    }
    @When("User Input Username")
    public void user_input_username() {
        WebElement username = driver.findElement(PageLogin.getField_username());
        username.click();
        username.sendKeys(Username);
    }
    @When("User Input Password")
    public void user_input_password() {
        WebElement password = driver.findElement(PageLogin.getField_password());
        password.click();
        password.sendKeys(Password);
    }
    @When("User click Button Login")
    public void user_click_button_login() {
        WebElement btnLogin = driver.findElement(PageLogin.getBtnlogin());
        btnLogin.click();
    }
    @Then("User Success Login And User Redirect To Dashboard Page")
    public void user_success_login_and_user_redirect_to_dashboard_page() throws InterruptedException {
        WebElement Orangehrm = driver.findElement(PageLogin.getOrangehrm());
        Orangehrm.isDisplayed();
        assertTrue("Dashboard Page Displayed",true);
        Thread.sleep(2000);
    }
}
