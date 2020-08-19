package challengingDomTest;

import static org.testng.Assert.*;
import baseTest.BaseTest;
import org.testng.annotations.Test;

public class ChallengingDomTest extends BaseTest {

    @Test
    public void challengingDomTest_clickTopButton(){
        var chall = homePage.clickChallengingDomPage();
        chall.clickTopButton();
    }

    @Test
    public void challengingDomTest_clickMiddleButton(){
        var chall = homePage.clickChallengingDomPage();
        chall.clickMiddleButton();
    }

    @Test
    public void challengingDomTest_clickBottomButton(){
        var chall = homePage.clickChallengingDomPage();
        chall.clickBottomButton();
    }

    @Test
    public void challengingDomTest_findCanvas() {
        var chall = homePage.clickChallengingDomPage();
        assertTrue(chall.findCanvas(),"The canvas did not found!");
    }

    @Test
    public void challengingDomTest_getLorem1(){
        var chall = homePage.clickChallengingDomPage();
        var lorem1 = chall.getTextLorem1();
        assertEquals(lorem1, "Iuvaret0",
                "The element name is not as expected: "
                        + lorem1 + ", Expected: Iuvaret0");
    }

    @Test
    public void challengingDomTest_getLorem2(){
        var chall = homePage.clickChallengingDomPage();
        var lorem2 = chall.getTextLorem2();
        assertEquals(lorem2, "Iuvaret1",
                "The element name is not as expected: "
                        + lorem2 + ", Expected: Iuvaret1");
    }

    @Test
    public void challengingDomTest_getDolor4(){
        var chall = homePage.clickChallengingDomPage();
        var dolor4 = chall.getTextDolor4();
        assertEquals(dolor4, "Adipisci3",
                "The element name is not as expected: "
                        + dolor4 + ", Expected: Adipisci3");
    }

    @Test
    public void challengingDomTest_getDolor5(){
        var chall = homePage.clickChallengingDomPage();
        var dolor5 = chall.getTextDolor5();
        assertEquals(dolor5, "Adipisci4",
                "The element name is not as expected: "
                        + dolor5 + ", Expected: Adipisci4");
    }

}
