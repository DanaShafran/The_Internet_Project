package basicAutoTest;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class BasicAuthTest extends BaseTest {
    @Test
    public void testBasicAuth(){
        var basicAuth = homePage.clickBasicAuthPage();
        basicAuth.sendUsernameAndPassToAlert();
        assertTrue(basicAuth.findCongrats().contains("Congratulations!"),
                "This is not the message that we expected to see");

    }
}
