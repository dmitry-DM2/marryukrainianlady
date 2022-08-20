import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BaseActions {

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinButton() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.REGISTRATION_BUTTON));
        driver.findElements(Locators.REGISTRATION_BUTTON).get(1).click();
    }

}
