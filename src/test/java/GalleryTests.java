import org.testng.annotations.Test;

public class GalleryTests extends BaseUI {

    @Test
    public void testSortPeoplePicturesByText() {
        mainPage.clickHowItWorksLink();
        howItWorksPage.clickGalleryLink();
        galleryPage.selectDropDownByText(Locators.SORT_DROPDOWN_LIST, Data.registrationDate);
    }

    @Test
    public void testSortPeoplePicturesByIndex() {
        mainPage.clickHowItWorksLink();
        howItWorksPage.clickGalleryLink();
        galleryPage.selectDropDownByIndex(Locators.SORT_DROPDOWN_LIST, 3);
    }

    @Test
    public void testSortPeoplePicturesByValue() {
        mainPage.clickHowItWorksLink();
        howItWorksPage.clickGalleryLink();
        galleryPage.selectDropDownByValue(Locators.SORT_DROPDOWN_LIST, Data.registrationDateValue);
    }
}
