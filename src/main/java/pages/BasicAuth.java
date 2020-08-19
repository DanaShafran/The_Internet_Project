package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicAuth {

    public BasicAuth(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    private By message = By.cssSelector("#content > div > p");

    public void sendUsernameAndPassToAlert(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }

    public String findCongrats(){
        return driver.findElement(message).getText();
    }

}
