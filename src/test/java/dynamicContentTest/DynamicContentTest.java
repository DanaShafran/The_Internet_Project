package dynamicContentTest;

import baseTest.BaseTest;
import org.junit.Assert;
import org.testng.annotations.Test;

public class DynamicContentTest extends BaseTest {

    @Test
    public void testDynamicContent(){
        var dc = homePage.clickDynamicContent();
        String con1 = dc.getTextContent();
        dc.refreshPage();
        String con2 = dc.getTextContent();

        Assert.assertNotEquals(con1, con2);
    }

}
