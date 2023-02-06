package StepDef;

import Config.Env;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Env{


    @Before
    public void before() {

        // Get To Url
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://employee.sdcillsy.my.id/");
        // maximize screen & close driver in 10 seconds if there is an issue
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void after(){
        driver.quit();
    }
}