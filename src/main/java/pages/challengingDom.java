package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class challengingDom {
    public challengingDom(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    private By topBtn = By.cssSelector("div [class = 'large-2 columns']  > a:nth-child(1)");
    private By middleBtn = By.cssSelector("div [class = 'large-2 columns']  > a:nth-child(3)");
    private By bottomBtn = By.cssSelector("div [class = 'large-2 columns']  > a:nth-child(5)");

    private By canvas = By.cssSelector("div #canvas");

    private By deleteBtn1 = By.cssSelector("tbody > tr > td > a[href*='delete']");
    private By editBtn1 = By.cssSelector("tbody > tr > td > a[href*='edit']");

    private String Lorem_format = "tbody > tr:nth-child(%s) td:nth-child(1)";
    private By trLorem1 = By.cssSelector(String.format(Lorem_format, "1"));
    private By trLorem2 = By.cssSelector(String.format(Lorem_format, "2"));

    private String Dolor_format = "tbody > tr:nth-child(%s) td:nth-child(3)";
    private By trDolor4 = By.cssSelector(String.format(Dolor_format, "4"));
    private By trDolor5 = By.cssSelector(String.format(Dolor_format, "5"));

    public void clickTopButton(){
        driver.findElement(topBtn).click();
        System.out.println("Top button has been clicked");
    }

    public void clickMiddleButton(){
        driver.findElement(middleBtn).click();
        System.out.println("Middle button has been clicked");
    }

    public void clickBottomButton(){
        driver.findElement(bottomBtn).click();
        System.out.println("Bottom button has been clicked");
    }

    public String getTextLorem1(){
        String lorem1 = driver.findElement(trLorem1).getText();
        return lorem1;
    }
    public String getTextLorem2(){
        String lorem2 = driver.findElement(trLorem2).getText();
        return lorem2;
    }

    public String getTextDolor4(){
        String dolor4 = driver.findElement(trDolor4).getText();
        return dolor4;
    }

    public String getTextDolor5(){
        String dolor5 = driver.findElement(trDolor5).getText();
        return dolor5;
    }

    public boolean findCanvas(){
       driver.findElement(canvas);
       return true;
    }

}
