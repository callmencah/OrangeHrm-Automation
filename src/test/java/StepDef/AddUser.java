package StepDef;
import Config.Env;
import ObjectRepository.PageAddUser;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.Scanner;

public class AddUser extends Env{
    PageAddUser PageAddUser = new PageAddUser();
    private WebDriverWait wait;

    @When("User Click Pim")
    public void user_click_pim() throws InterruptedException {
        Thread.sleep(1000);
        WebElement ClickPim = driver.findElement(PageAddUser.getClickPim());
        ClickPim.click();
    }

    @When("User Click Add Employee")
    public void user_click_add_employee() {
        WebElement ClicaddEmployee = driver.findElement(PageAddUser.getClickAddEmployee());
        ClicaddEmployee.click();
    }


    @When("User Set First Name")
    public void user_set_first_name() {
        driver.findElement(PageAddUser.getSetFirstName()).sendKeys(UserLogin);
        String savedFirstName = UserLogin;
        try {
            FileWriter writer = new FileWriter("src/test/file/firstname.txt", false);
            writer.write(savedFirstName + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @When("User Set Last Name")
    public void user_set_last_name() {
        driver.findElement(PageAddUser.getSetLastName()).sendKeys(randomLastName);
        String savedFirstName = randomLastName;
        try {
            FileWriter writer = new FileWriter("src/test/file/Lastname.txt", false);
            writer.write(savedFirstName + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @When("User Change Display Profile")
    public void user_change_display_profile() {
        WebElement profilepic = driver.findElement(PageAddUser.getClickBtnPlus());
        profilepic.sendKeys("C:\\Users\\cahya\\IdeaProjects\\OrangeHRM-UiTesting\\src\\test\\file\\Ujang.png");
    }
    @When("User Click Save")
    public void user_click_save() {
        WebElement save = driver.findElement(PageAddUser.getClickSave());
        save.click();
    }

    @Then("User Success Add User")
    public void user_success_add_user() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageAddUser.getToster())).isDisplayed();
        Thread.sleep(4000);
        WebElement toster = driver.findElement(PageAddUser.getToster());
        toster.isDisplayed();
        Thread.sleep(5000);
    }
    @When("User Click Create Login Details")
    public void user_click_create_login_details() {
        WebElement clickcreate = driver.findElement(PageAddUser.getClickCreateLogin());
        clickcreate.click();
    }
    @When("User Set Username")
    public void user_set_username() throws InterruptedException {
        WebElement user = driver.findElement(PageAddUser.getUserName());
        try {
            Scanner sc = new Scanner(new File("src/test/file/firstname.txt"));
            while (sc.hasNextLine()) {

                String savedName = sc.nextLine();
                Thread.sleep(5000);
                user.sendKeys(savedName);
            }
            Thread.sleep(2000);
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }


    @When("User Set Password")
    public void user_set_password() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageAddUser.getUserPassword()));
        WebElement passwd = driver.findElement(PageAddUser.getUserPassword());
        passwd.click();
        passwd.sendKeys(UserPassword);
    }
    @When("User Set Confirm Password")
    public void user_set_confirm_password() {
        WebElement cpasswd = driver.findElement(PageAddUser.getConfirmPassword());
        cpasswd.click();
        cpasswd.sendKeys(UserPassword);
    }

    @When("User Set Employee Id")
    public void user_set_employee_id() {
        WebElement employee = driver.findElement(PageAddUser.getEmployee());
        employee.isDisplayed();
        employee.click();
        employee.sendKeys(EmployeeId);
    }

}
