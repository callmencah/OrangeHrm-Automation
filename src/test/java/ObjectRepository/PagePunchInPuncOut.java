package ObjectRepository;

import org.openqa.selenium.By;

public class PagePunchInPuncOut {

    By Clickiconclock = By.xpath("//*[@class=\"oxd-icon-button oxd-icon-button--solid-main orangehrm-attendance-card-action\"]");

    public By getClickiconclock() {
        return Clickiconclock;
    }

    By SetNote = By.xpath("//*[@placeholder=\"Type here\"]");


    public By getSetNote() {
        return SetNote;
    }
    By SetNoteOut = By.xpath("//*[@placeholder=\"Type here\"]");

    public By getSetNoteOut() {
        return SetNoteOut;
    }

    By btnIn = By.xpath("//*[@type=\"submit\"]\n");


    public By getBtnIn() {
        return btnIn;
    }
    By btnOut = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button");

    public By getBtnOut() {
        return btnOut;
    }

    By VerifyPunchIn = By.xpath("//h6[text()='Punch Out']");

    public By getVerifyPunchIn() {
        return VerifyPunchIn;
    }

    By VerifyPunchOut = By.xpath("//h6[text()='Punch In']");

    public By getVerifyPunchOut() {
        return VerifyPunchOut;
    }

}
