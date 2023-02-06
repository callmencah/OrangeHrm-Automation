package ObjectRepository;

import Config.Env;
import org.openqa.selenium.By;

public class PageEditProfile extends Env {

    By myInfo = By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']");

    public By getMyInfo() {
        return myInfo;
    }

    By Nationality = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]");
    public By getNationality() {
        return Nationality;
    }
    By MaritalStatus = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i");
    By Married = By.xpath("//div[contains(text(),'Married')]");

    public By getMarried() {
        return Married;
    }

    public By getMaritalStatus() {
        return MaritalStatus;
    }
    public By getListRandom(int randomList) {
        By listNationality = By.xpath("//div[@role = \"listbox\"]/div[\"+ randomList + \"]");
        return listNationality;
    }

    public By getRandomGender() {
        //Random String
        String [] gender = {String.valueOf(radioMale), String.valueOf(radioFemale)};
        int select = rand.nextInt(gender.length);

        By randomGender = By.xpath(gender[select]);
        return randomGender;
    }
    By btnsave = By.xpath("//button[@type='submit']");
    public By getBtnsave() {
        return btnsave;
    }

}
