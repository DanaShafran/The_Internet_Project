package dynamicControlsTest;

import baseTest.BaseTest;
import org.testng.Assert;
import pages.dynamicControls;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void dynamicControlsTest1(){
        dynamicControls dc = homePage.clickDynamicControls();
        dc.checkAndRemove();
        String x = dc.getMessage1Test();
        Assert.assertEquals(x, "It's gone!",
                "Wrong message: " + x);
    }

    @Test
    public void dynamicControlsTest2(){
        dynamicControls dc = homePage.clickDynamicControls();
        dc.clickAddCheckAndRemove();
        String y = dc.getMessage1Test();
        Assert.assertEquals(y, "It's back!",
                "Wrong message: " + y);
    }

    @Test
    public void dynamicControlsTest3(){
        dynamicControls dc = homePage.clickDynamicControls();
        dc.enable();
        String w = dc.getMessage2Test();
        Assert.assertEquals(w, "It's enabled!",
                "Wrong message: " + w);
    }

    @Test
    public void dynamicControlsTest4(){
        dynamicControls dc = homePage.clickDynamicControls();
        dc.disable();
        String z = dc.getMessage2Test();
        Assert.assertEquals(z, "It's disabled!",
                "Wrong message: " + z);
    }
}
