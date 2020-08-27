package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class contextMenu {
    public contextMenu(WebDriver driver){
        this.driver = driver;
    }

    private WebDriver driver;
    private By hotSpot = By.cssSelector("#hot-spot");

    public void rightClickHotSpot(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(hotSpot)).perform();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }



}
