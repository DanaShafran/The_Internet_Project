package dynamicControlsTest;

import baseTest.BaseTest;
import org.testng.Assert;
import pages.dynamicControls;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void dynamicControlsTest1(){
        dynamicControls dc = homePage.clickDynamicControls();
        String x = dc.checkAndRemove();
        Assert.assertEquals(x, "It's gone!",
                "Wrong message: " + x);
    }

    @Test
    public void dynamicControlsTest2(){
        dynamicControls dc = homePage.clickDynamicControls();
        String y = dc.clickAddCheckAndRemove();
        Assert.assertEquals(y, "It's back!",
                "Wrong message: " + y);
    }

    @Test
    public void dynamicControlsTest3(){
        dynamicControls dc = homePage.clickDynamicControls();
        String w = dc.enableAndDisable();
        Assert.assertEquals(w, "It's disabled!",
                "Wrong message: " + w);
    }
}
