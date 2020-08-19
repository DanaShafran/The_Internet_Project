package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ABTesting {
    private WebDriver driver;
    public ABTesting(WebDriver driver) {
        this.driver = driver;
    }
    private By ABParagraph = By.cssSelector("div > p");

    public String getText(){
        String p = driver.findElement(ABParagraph).getText();
        return p;
    }


}
