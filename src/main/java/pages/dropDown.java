package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dropDown {
    public dropDown(WebDriver driver){
        this.driver = driver;
    }

    private WebDriver driver;
    private By dropDownBtn = By.cssSelector("div > #dropdown");
    private By option1 = By.cssSelector("#dropdown > option:nth-child(2)");
    private By option2 = By.cssSelector("#dropdown > option:nth-child(3)");

    public String chooseOption1(){
        driver.findElement(dropDownBtn).click();
        driver.findElement(option1).click();
        return returnSelected(option1);
    }

    public String chooseOption2(){
        driver.findElement(dropDownBtn).click();
        driver.findElement(option2).click();
        return returnSelected(option2);
    }

    public String returnSelected (By option){
        WebElement Dropdown = driver.findElement(option);
        String optionSelected = Dropdown.getText();
        return optionSelected;
    }
}
