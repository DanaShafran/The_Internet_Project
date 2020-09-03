package digestAuthenticationTest;

import static org.testng.Assert.*;
import baseTest.BaseTest;
import org.testng.annotations.Test;

public class DigestAuthenticationTest extends BaseTest {

    @Test
    public void digestAuthenticationTest()
    {
        var da = homePage.clickDigestAuthenticationPage();
        da.sendUsernameAndPassToAlert();
        assertEquals(da.getMessageText(),
                "Congratulations! You must have the proper credentials.",
                "The message is incorrect");
    }
}
