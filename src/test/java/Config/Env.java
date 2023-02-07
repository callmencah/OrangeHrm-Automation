package Config;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Env {
    Faker faker = new Faker();
    protected static WebDriver driver;
    public static WebDriverWait wait;
    public Random rand = new Random();

    public String randomLastName = faker.name().lastName();
    public String Username = "Admin";

    public String Password = "admin123";
    public String UserUsername = "ujangs"+rand.nextInt(999);
    public String EmployeeId = "0"+rand.nextInt(999);

    public String UserLogin = "Ncah"+rand.nextInt(99);

    public String fakerUsername(){
        String randomUsername = faker.name().username();
        return randomUsername;
    }

    public String UserPassword = "11AA22bb;";
    public String radioMale = "//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span";
    public String radioFemale = "//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span";


}
