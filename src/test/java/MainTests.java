import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class MainTests extends BaseUI {

    By registrationButton = By.cssSelector("button[id='show-registration-block']");
    By textFieldEmail = By.cssSelector("input[id='email']");
    By textFieldPassword = By.cssSelector("input[id='password']");
    By nextButton = By.xpath("//button[@data-action='next-page'][text()='Next']");
    By usernameField = By.cssSelector("input[id='nickname']");
    By birthDateDropDownListDay = By.xpath("//div[@id='daySelect']");
    By birthDateDropDownListDaySelect = By.xpath("//ul[@class='dropdown-menu']//a[@data-value='16']");
    By birthDateDropDownListMonth = By.xpath("//div[@id='monthSelect']");
    By birthDateDropDownListMonthSelect = By.xpath("//ul[@class='dropdown-menu']//a[@data-value='4'][text()='May']");
    By birthDateDropDownListYear = By.xpath("//div[@id='yearSelect']");
    By birthDateDropDownListYearSelect = By.xpath("//ul[@class='dropdown-menu']//a[@data-value='1942']");
    By confirmationCheckBox = By.xpath("//input[@id='confirmation']");
    By locationFieldAutocomplete = By.xpath("//input[@name='region_name']");
    By locationFieldSelectedCity = By.xpath("//div[contains(@id,'region_select')]//li[@country='UA'][text()='Odessa, Ukraine']");
    By userPhoneField = By.cssSelector("input[name='data[phone]']");

    String email = "dmstest@gmail.com";
    String password = "1234567@";
    String userNick = "dmstest";
    String userPhone = "+380961111111";
    String locationCity = "Odessa";

    @Test
    public void completeRegistration() {
        wait.until(ExpectedConditions.elementToBeClickable(registrationButton));
        driver.findElements(registrationButton).get(1).click();
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldPassword).sendKeys(password);
        driver.findElement(nextButton).click();
        driver.findElement(usernameField).sendKeys(userNick);
        driver.findElement(birthDateDropDownListDay).click();
        driver.findElement(birthDateDropDownListDaySelect).click();
        driver.findElement(birthDateDropDownListMonth).click();
        driver.findElement(birthDateDropDownListMonthSelect).click();
        driver.findElement(birthDateDropDownListYear).click();
        driver.findElement(birthDateDropDownListYearSelect).click();
        driver.findElement(userPhoneField).sendKeys(userPhone);
        driver.findElement(confirmationCheckBox).click();
        driver.findElement(locationFieldAutocomplete).clear();
        driver.findElement(locationFieldAutocomplete).sendKeys(locationCity);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(locationFieldSelectedCity).click();
    }

}
