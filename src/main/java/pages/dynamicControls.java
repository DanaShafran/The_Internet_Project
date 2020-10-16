package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicControls {

    private WebDriver driver;

    public dynamicControls(WebDriver driver){
        this.driver = driver;
    }

    private By checkbox = By.cssSelector("#checkbox-example > div > input");
    private By addButton = By.xpath("//button[text()='Add']");
    private By removeButton = By.xpath("//button[text()='Remove']");
    private By message1 = By.cssSelector("#checkbox-example> #message");

    private By enableBtn = By.xpath("//button[text()='Enable']");
    private By disableBtn = By.xpath("//button[text()='Disable']");
    private By inputField = By.cssSelector("#input-example  > input");
    private By message2 = By.cssSelector("#input-example > #message");



    public void checkAndRemove(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(checkbox).click();
        driver.findElement(removeButton).click();
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(message1)));
    }

    public void clickAddCheckAndRemove(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(addButton).click();
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(checkbox)));
    }

    public String getMessage1Test(){
        String messageText = driver.findElement(message1).getText();
        System.out.println(messageText);
        return messageText;
    }




    public void enable(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(enableBtn).click();
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(message2)));
    }

    public void disable(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(inputField).sendKeys(Keys.CLEAR);
        driver.findElement(inputField).sendKeys("Dana Banana");
        driver.findElement(disableBtn).click();
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(message2)));
    }

    public String getMessage2Test(){
        String messageText = driver.findElement(message2).getText();
        System.out.println(messageText);
        return messageText;
    }

}
