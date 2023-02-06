package ObjectRepository;

import org.openqa.selenium.By;

public class PageAddUser {
    By orangehrm = By.xpath("//h6");


    public By getOrangehrm() {
        return orangehrm;
    }
    By ClickPim = By.xpath("//a[@href = '/web/index.php/pim/viewPimModule']");

    public By getClickPim() {
        return ClickPim;
    }

    By ClickAddEmployee = By.xpath("//li[@class='oxd-topbar-body-nav-tab'][1]\n");

    public By getClickAddEmployee() {
        return ClickAddEmployee;
    }

    By SetFirstName = By.xpath("//*[@placeholder=\"First Name\"]");

    public By getSetFirstName() {
        return SetFirstName;
    }

    By SetLastName = By.xpath("//*[@placeholder=\"Last Name\"]");

    public By getSetLastName() {
        return SetLastName;
    }

    By ClickBtnPlus = By.xpath("//*[@type=\"file\"]");
    public By getClickBtnPlus() {
        return ClickBtnPlus;
    }

    By ClickCreateLogin = By.xpath("//span[contains(@class,'oxd-switch-input oxd-switch-input--active')]");

    public By getClickCreateLogin() {
        return ClickCreateLogin;
    }

    By UserName = By.xpath("//label[text()='Username']/following::input");
    public By getUserName() {
        return UserName;
    }
    By Employee = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");

    public By getEmployee() {
        return Employee;
    }

    By UserPassword = By.xpath("//input[@type='password']");

    public By getUserPassword() {
        return UserPassword;
    }

    By ConfirmPassword = By.xpath("//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input");

    public By getConfirmPassword() {
        return ConfirmPassword;
    }

    By ClickSave = By.xpath("//*[@type=\"submit\"]");

    public By getClickSave() {
        return ClickSave;
    }

    By DisplayName = By.xpath("//div[@class = 'orangehrm-edit-employee-name']//h6");

    public By getDisplayName() {
        return DisplayName;
    }
    By toster = By.xpath("//*[@id=\"oxd-toaster_1\"]");

    public By getToster() {
        return toster;
    }

}
