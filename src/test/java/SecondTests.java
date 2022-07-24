import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SecondTests extends BaseUI {

    By registrationButton = By.xpath("//button[@id='show-registration-block']");
    By textFieldEmail = By.xpath("//input[@id='email']");
    By textFieldPassword = By.xpath("//input[@id='password']");
    By facebookButton = By.xpath("//a[@href='https://marryukrainianlady.org/users_connections/oauth_login/1']");
    By facebookEmailField = By.xpath("//input[@id='email']");
    By facebookPasswordField = By.xpath("//input[@id='pass']");
    String email = "dmstest@gmail.com";
    String password = "1234567@";

    @Test
    public void secondTests1() {
        driver.findElements(registrationButton).get(1).click();
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldPassword).sendKeys(password);
        driver.findElement(facebookButton).click();
        driver.findElement(facebookEmailField).sendKeys(email);
        driver.findElement(facebookPasswordField).sendKeys(password);
    }

}
