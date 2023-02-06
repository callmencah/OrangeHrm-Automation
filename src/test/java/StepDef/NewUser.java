package StepDef;
import Config.Env;
import ObjectRepository.PageNewUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
public class NewUser extends Env{
    PageNewUser PageNewUser = new PageNewUser();
    private WebDriverWait wait;
    @When("User Set Username New")
    public void userSetUsernameNew() throws InterruptedException {
        Thread.sleep(2000);
        WebElement username = driver.findElement(PageNewUser.getField_username());
        System.out.println(UserUsername);
        username.click();
        username.sendKeys(UserUsername);
    }
    @And("User Set Password New")
    public void user_set_password_new() throws InterruptedException {
        Thread.sleep(2000);
        WebElement password = driver.findElement(PageNewUser.getField_password());
        System.out.println(UserPassword);
        password.click();
        password.sendKeys(UserPassword);

    }

}
