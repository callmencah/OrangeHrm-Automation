package Config;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class Env {
    Faker faker = new Faker();
    protected static WebDriver driver;
    public static WebDriverWait wait;
    protected static String url = "http://employee.sdcillsy.my.id/";
    public Random rand = new Random();

    public String randomFirstName = faker.name().firstName();
    public String randomLastName = faker.name().lastName();
    public String Username = "Admin";

    public String Password = "s3Kol4HQA!*";
    public String UserUsername = "ujangs"+rand.nextInt(999);
    public String EmployeeId = "0"+rand.nextInt(999);

    public String UserLogin = "Ncah"+rand.nextInt(99);

    public String fakerUsername(){
        String randomUsername = faker.name().username();
        return randomUsername;
    }

    public int randomList;
    public int randomGender;
    public String UserPassword = "11AA22bb;";
    public String radioMale = "//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span";
    public String radioFemale = "//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span";


}
