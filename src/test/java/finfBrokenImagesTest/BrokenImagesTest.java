package finfBrokenImagesTest;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class BrokenImagesTest extends BaseTest {

    @Test
    public void testBrokenImages(){
        var brokenImages = homePage.clickBrokenImagePage();
        var imagesList = brokenImages.findImages();
        brokenImages.openImages(imagesList);
    }
}
