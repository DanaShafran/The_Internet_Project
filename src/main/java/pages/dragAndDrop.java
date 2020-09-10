package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
    public dragAndDrop(WebDriver driver){
        this.driver = driver;
    }

    private WebDriver driver;
    private By columnA = By.cssSelector("#column-a > header");
    private By columnB = By.cssSelector("#column-b > header");

    public void dragAndDrop(){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(columnA),
                driver.findElement(columnB)).build().perform();
    }
}
