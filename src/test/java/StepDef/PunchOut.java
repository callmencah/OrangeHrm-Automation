package StepDef;

import Config.Env;
import ObjectRepository.PagePunchInPuncOut;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class PunchOut extends Env{
    PagePunchInPuncOut PagePunchInPuncOut = new PagePunchInPuncOut();

    @When("User Set Note Out")
    public void user_set_note_out() throws InterruptedException {
        WebElement SetNoteOut = driver.findElement(PagePunchInPuncOut.getSetNote());
        Thread.sleep(4000);
        SetNoteOut.click();
        Thread.sleep(4000);
        SetNoteOut.sendKeys("Punch Out Yah!");
    }

    @When("User Click Button Out")
    public void user_click_button_out()  {
        WebElement PunchOut = driver.findElement(PagePunchInPuncOut.getBtnOut());
        PunchOut.click();
    }

    @Then("User Success Punch Out")
    public void user_success_punch_out() throws InterruptedException {
        WebElement btnout = driver.findElement(PagePunchInPuncOut.getVerifyPunchIn());
        btnout.isDisplayed();
        Thread.sleep(5000);
    }
}
