import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MainTests extends BaseUI {

    By registrationButton = By.cssSelector("button[id='show-registration-block']");
    By textFieldEmail = By.cssSelector("input[id='email']");
    By textFieldPassword = By.cssSelector("input[id='password']");
    By nextButton = By.xpath("//button[@data-action='next-page'][text()='Next']");
    By usernameField = By.cssSelector("input[id='nickname']");
    By userPhoneField = By.cssSelector("input[name='data[phone]']");
    String email = "dmstest@gmail.com";
    String password = "1234567@";
    String userNick = "dmstest";
    String userPhone = "+380961111111";

    @Test
    public void mainPageTests1() {
        driver.findElements(registrationButton).get(1).click();
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldPassword).sendKeys(password);
        driver.findElement(nextButton).click();
        driver.findElement(usernameField).sendKeys(userNick);
        driver.findElement(userPhoneField).sendKeys(userPhone);
    }

}
