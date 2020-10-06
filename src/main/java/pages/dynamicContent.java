package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dynamicContent {
    public dynamicContent(WebDriver driver){
        this.driver = driver;
    }
    private WebDriver driver;

    private By dynamicContent1 = By.cssSelector("div div #content [class*='10']");

    public String getTextContent(){
        String text = driver.findElement(dynamicContent1).getText();
        return text;
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }

}
