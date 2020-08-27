package contextMenuTest;
import static org.testng.Assert.*;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextMenuTest(){
        var cm = homePage.clickContextMenuPage();
        cm.rightClickHotSpot();
        assertEquals(cm.getAlertText(),
                "You selected a context menu",
                "Context menu incorrect!");
    }
}
