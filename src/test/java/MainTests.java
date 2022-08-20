import org.testng.annotations.Test;

public class MainTests extends BaseUI {


    @Test
    public void completeRegistration() {
        mainPage.clickJoinButton();
        registrationForm.completeFirstPartOfRegistration();
        registrationForm.completeSecondPartOfRegistration();

    }

}
