import org.openqa.selenium.By;

public class Locators {

    //MainPage locators
    public static final By HOW_IT_WORKS_LINK = By.xpath("//a[@href='/content/view/how-it-works']");

    //HowItWorksPage locators
    public static final By GALLERY_LINK = By.xpath("//button[@id='main_search_button_user_line']");

    // Gallery (Find People) locators
    public static final By SORT_DROPDOWN_LIST = By.xpath("//select[contains(@id, 'sorter-select')]");

    // Registration locators
    public static final By REGISTRATION_BUTTON = By.cssSelector("button[id='show-registration-block']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input[id='email']");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input[id='password']");
    public static final By NEXT_BUTTON = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By USERNAME_FIELD = By.cssSelector("input[id='nickname']");
    public static final By BIRTH_DATE_DROPDOWNLIST_DAY = By.xpath("//div[@id='daySelect']");
    public static final By BIRTH_DATE_DROPDOWNLIST_DAY_SELECT = By.xpath("//ul//a[@data-value='16']");
    public static final By BIRTH_DATE_DROPDOWNLIST_MONTH = By.xpath("//div[@id='monthSelect']");
    public static final By BIRTH_DATE_DROPDOWNLIST_DAY_MONTH_SELECT = By.xpath("//ul//a[@data-value='4'][text()='May']");
    public static final By BIRTH_DATE_DROPDOWNLIST_YEAR = By.xpath("//div[@id='yearSelect']");
    public static final By BIRTH_DATE_DROPDOWNLIST_YEAR_SELECT = By.xpath("//ul//a[@data-value='1942']");
    public static final By CONFIRMATION_CHECKBOX = By.xpath("//input[@id='confirmation']");
    public static final By LOCATION_FIELD_AUTOCOMPLETE = By.xpath("//input[@name='region_name']");
    public static final By LOCATION_FIELD_SELECTED_CITY = By.xpath("//div[contains(@id,'region_select')]//li[@country='UA'][text()='Odessa, Ukraine']");
    public static final By USER_PHONE_FIELD = By.cssSelector("input[name='data[phone]']");

}
