package StepDef;

import Config.Env;
import ObjectRepository.PagePunchInPuncOut;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class PunchIn extends Env{
    PagePunchInPuncOut PagePunchInPuncOut = new PagePunchInPuncOut();

    @When("User Click Icon Clock")
    public void user_click_icon_clock() {
        WebElement Clickiconclock = driver.findElement(PagePunchInPuncOut.getClickiconclock());
        Clickiconclock.click();
    }

    @When("User Set Note")
    public void user_set_note() throws InterruptedException {
        WebElement SetNote = driver.findElement(PagePunchInPuncOut.getSetNote());
        SetNote.click();
        Thread.sleep(3000);
        SetNote.sendKeys("Punch In Yah!");
    }

    @When("User Click Button In")
    public void user_click_button_in() {
        WebElement btnIn = driver.findElement(PagePunchInPuncOut.getBtnIn());
        btnIn.click();
    }

    @Then("User Success Punch In")
    public void user_success_punch_in() throws InterruptedException {
        WebElement PunchIn = driver.findElement(PagePunchInPuncOut.getVerifyPunchOut());
        PunchIn.isDisplayed();
        Thread.sleep(5000);
    }
}
