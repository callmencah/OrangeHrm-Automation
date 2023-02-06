package ObjectRepository;

import org.openqa.selenium.By;

public class PageNewUser {

    By titlelogin = By.xpath("//*[@class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]");

    public By getTitlelogin() {
        return titlelogin;
    }

    By field_username = By.xpath("//*[@name=\"username\"]");

    public By getField_username() {
        return field_username;
    }
    By field_password = By.xpath("//*[@name=\"password\"]");
    public By getField_password() {
        return field_password;
    }

    By btnlogin = By.xpath("//*[@type=\"submit\"]");
    public By getBtnlogin() {
        return btnlogin;
    }
    By orangehrm = By.xpath("//*[@alt=\"client brand banner\"]");

    public By getOrangehrm() {
        return orangehrm;
    }


}
