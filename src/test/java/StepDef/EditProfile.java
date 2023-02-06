package StepDef;

import Config.Env;
import ObjectRepository.PageEditProfile;
import ObjectRepository.PageAddUser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EditProfile extends Env{
    PageEditProfile PageEditProfile = new PageEditProfile();
    PageAddUser PageAddUser = new PageAddUser();

    @When("User Click My Info")
    public void user_click_my_info() throws InterruptedException {
        Thread.sleep(2000);
        WebElement myinfo = driver.findElement(PageEditProfile.getMyInfo());
        myinfo.click();
        Thread.sleep(4000);
    }

    @When("User Set National")
    public void user_set_national() throws InterruptedException {
        Actions act = new Actions(driver);
        driver.findElement(PageEditProfile.getNationality()).click();

        Thread.sleep(4000);
        act.sendKeys("i",Keys.TAB);
    }

    @When("User Set Marital")
    public void user_set_marital() throws InterruptedException {
        Actions act = new Actions(driver);
        driver.findElement(PageEditProfile.getMaritalStatus()).click();

        Thread.sleep(4000);
        act.sendKeys("s",Keys.TAB);
    }

    @When("User Set Gender")
    public void user_set_gender() {
        driver.findElement(PageEditProfile.getRandomGender()).click();
    }

    @When("User Click Button Save")
    public void user_click_button_save() {
        driver.findElement(PageEditProfile.getBtnsave()).click();
    }

    @Then("User Success Change Profile")
    public void user_success_change_profile() {
        driver.findElement(PageAddUser.getToster()).click();
    }

}
