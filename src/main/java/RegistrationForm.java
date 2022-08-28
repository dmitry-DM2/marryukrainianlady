import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegistrationForm extends BaseActions {

    public RegistrationForm(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void completeFirstPartOfRegistration() {
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.NEXT_BUTTON).click();
    }

    public void completeSecondPartOfRegistration() {
        driver.findElement(Locators.USERNAME_FIELD).sendKeys(Data.userNick);
        driver.findElement(Locators.BIRTH_DATE_DROPDOWNLIST_DAY).click();
        driver.findElement(Locators.BIRTH_DATE_DROPDOWNLIST_DAY_SELECT).click();
        driver.findElement(Locators.BIRTH_DATE_DROPDOWNLIST_MONTH).click();
        driver.findElement(Locators.BIRTH_DATE_DROPDOWNLIST_DAY_MONTH_SELECT).click();
        driver.findElement(Locators.BIRTH_DATE_DROPDOWNLIST_YEAR).click();
        driver.findElement(Locators.BIRTH_DATE_DROPDOWNLIST_YEAR_SELECT).click();
        driver.findElement(Locators.USER_PHONE_FIELD).sendKeys(Data.userPhone);
        driver.findElement(Locators.CONFIRMATION_CHECKBOX).click();
        driver.findElement(Locators.LOCATION_FIELD_AUTOCOMPLETE).clear();
        driver.findElement(Locators.LOCATION_FIELD_AUTOCOMPLETE).sendKeys(Data.locationCity);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.findElement(Locators.LOCATION_FIELD_SELECTED_CITY).click();
    }
}
