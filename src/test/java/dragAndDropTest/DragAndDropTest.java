package dragAndDropTest;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {

    @Test
    public void testDragAndDrop(){
        var dad = homePage.clickDragAndDropPage();
        dad.dragAndDrop();
    }

}
