package abTest;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ABTest extends BaseTest {
    @Test
    public void testABTest(){
        var abtest = homePage.clickABTestingPage();
        assertTrue(abtest.getText().contains("Also known as split testing."),
                "The text incorrect");
    }

}
