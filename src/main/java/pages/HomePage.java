package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public ABTesting clickABTestingPage(){
        clickLink("A/B Testing");
        return new ABTesting(driver);
    }

    public addRemoveElement clickAddRemoveElementPage(){
        clickLink("Add/Remove Elements");
        return new addRemoveElement(driver);
    }

    public BasicAuth clickBasicAuthPage(){
        clickLink("Basic Auth");
        return new BasicAuth(driver);
    }

    public brokenImage clickBrokenImagePage(){
        clickLink("Broken Images");
        return new brokenImage(driver);
    }

    public challengingDom clickChallengingDomPage(){
        clickLink("Challenging DOM");
        return new challengingDom(driver);
    }

    public checkBoxes clickCheckBoxesPage(){
        clickLink("Checkboxes");
        return new checkBoxes(driver);
    }

    public contextMenu clickContextMenuPage(){
        clickLink("Context Menu");
        return new contextMenu(driver);
    }

    public digestAuthentication clickDigestAuthenticationPage(){
        clickLink("Digest Authentication");
        return new digestAuthentication(driver);
    }

    public disappearingElements clickDisappearingElementsPage(){
        clickLink("Disappearing Elements");
        return new disappearingElements(driver);
    }

    public dragAndDrop clickDragAndDropPage(){
        clickLink("Drag and Drop");
        return new dragAndDrop(driver);
    }

    public dropDown clickDropDownPage(){
        clickLink("Dropdown");
        return new dropDown(driver);
    }
    public dynamicContent clickDynamicContent(){
        clickLink("Dynamic Content");
        return new dynamicContent(driver);
    }

}
