package dropDownTest;
import static org.testng.Assert.*;
import baseTest.BaseTest;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

    @Test
    public void dropDownTest(){
        var dd = homePage.clickDropDownPage();

        assertEquals(dd.chooseOption1(),"Option 1",
                "Wrong option has been selected");

        assertEquals(dd.chooseOption2(), "Option 2",
                "Wrong option has been selected");
    }
}
