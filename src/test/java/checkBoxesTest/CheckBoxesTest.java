package checkBoxesTest;

import baseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CheckBoxesTest extends BaseTest {

    @Test
    public void testCheckBoxes(){
        var cb = homePage.clickCheckBoxesPage();
        assertTrue(cb.checkBox1());
        assertTrue(cb.checkBox2());
    }

}
