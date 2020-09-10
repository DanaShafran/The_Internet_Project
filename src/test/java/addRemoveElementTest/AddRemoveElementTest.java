package addRemoveElementTest;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AddRemoveElementTest extends BaseTest {
    @Test
    public void testAddRemoveElement(){
        var addRemove = homePage.clickAddRemoveElementPage();
        int number = 5;
        addRemove.addElement(number);
        addRemove.removeElement(number);
        assertFalse(addRemove.isThereElements(),
                "Failed, there are still removable elements");
    }
}
