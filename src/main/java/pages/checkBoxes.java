package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkBoxes {
    public checkBoxes(WebDriver driver){
        this.driver = driver;
    }

    private WebDriver driver;

    private By checkBox1 = By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)");
    private By checkBox2 = By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)");

    public boolean checkBox1(){
        var cb = driver.findElement(checkBox1);
        if(!cb.isSelected()){
            cb.click();
        }
        return cb.isSelected();
    }

    public boolean checkBox2(){
        var cb = driver.findElement(checkBox2);
        if(!cb.isSelected()){
            cb.click();
        }
        return cb.isSelected();
    }

}
