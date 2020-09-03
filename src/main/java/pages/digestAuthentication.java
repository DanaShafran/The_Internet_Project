package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class digestAuthentication {

    public digestAuthentication(WebDriver driver){
        this.driver = driver;
    }
    private WebDriver driver;

    private By message = By.cssSelector("#content >div > p");

    public String getMessageText(){
        String  messageTest = driver.findElement(message).getText();
        return messageTest;
    }

    public void sendUsernameAndPassToAlert(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }



}
