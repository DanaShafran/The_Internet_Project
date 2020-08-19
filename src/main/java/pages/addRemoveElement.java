package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class addRemoveElement {

    private WebDriver driver;

    addRemoveElement(WebDriver driver){
        this.driver = driver;
    }
    private By addElementBtn = By.cssSelector("div[class*=example] > button");
    private By removeElementBtn = By.cssSelector("div[id*=elements] > button");

    public void addElement(int addNumber){
        for(int i = 0; i < addNumber; i++){
            driver.findElement(addElementBtn).click();
        }
    }

    public void removeElement(int removeNumber){
        for(int i = 0; i < removeNumber; i++){
            driver.findElement(removeElementBtn).click();
        }
    }

    public boolean isThereElements(){
        List<WebElement> removeElementBtns = driver.findElements(removeElementBtn);
        if (removeElementBtns.isEmpty()){
            return false;
        }
        else return true;
    }
}
