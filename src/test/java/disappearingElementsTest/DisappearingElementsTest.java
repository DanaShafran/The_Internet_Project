package disappearingElementsTest;
import static org.testng.Assert.*;
import baseTest.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class DisappearingElementsTest extends BaseTest {
    @Test
    public void disappearingElementsTest(){
        var de = homePage.clickDisappearingElementsPage();
        de.clickHomeButton();
        de.goBackWithBrowser();
        de.clickAboutButton();
        de.goBackWithBrowser();
        de.clickContactUsButton();
        de.goBackWithBrowser();
        de.clickPortfolioButton();
        de.goBackWithBrowser();
        de.goBackWithBrowser();

        assertEquals(de.getHomePageTitleTest(),
                "Welcome to the-internet",
                        "Title is incorrect!");
    }

}
