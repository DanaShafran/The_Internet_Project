package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class disappearingElements {
    public disappearingElements(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;

    private By homeButton = By.cssSelector("ul > li:nth-child(1)");
    private By aboutButton = By.cssSelector("ul > li:nth-child(2)");
    private By contactUsButton = By.cssSelector("ul > li:nth-child(3)");
    private By portfolioButton = By.cssSelector("ul > li:nth-child(4)");
    private By homePageTitle = By.cssSelector("h1[class*='heading']");

    public void clickHomeButton(){
        driver.findElement(homeButton).click();
    }

    public void clickAboutButton(){
        driver.findElement(aboutButton).click();
    }

    public void clickContactUsButton(){
        driver.findElement(contactUsButton).click();
    }

    public void clickPortfolioButton(){
        driver.findElement(portfolioButton).click();
    }

    public void goBackWithBrowser(){
        driver.navigate().back();
    }

    public String getHomePageTitleTest(){
        String title = driver.findElement(homePageTitle).getText();
        return title;
    }


}
